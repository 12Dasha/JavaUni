package Lab11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;

public class Cafe {
    private ArrayList<Queue> Queues;
    private Person lastPersonThread = null;

    public Cafe(ArrayList<Queue> cashboxQueues) {
        this.Queues = cashboxQueues;

        for(Queue Queue: this.Queues) {
            for(Person person: Queue.getQueue()) {
                person.setCafe(this);
            }
        }
    }

    public ArrayList<Queue> getCashboxQueues() {
        return Queues;
    }

    public int getMinQueueIndex() {
        return this.Queues.stream()
                .min(Comparator.comparingInt(Queue::getQueueLength)).get().getQueueId();
    }

    public int getMinQueueSize() {
        return this.Queues.stream()
                .map(Queue::getQueueLength)
                .min(Integer::compare).get();
    }

    public void updatePersonThread(int personId) {
        for (Queue cashboxQueue: this.Queues) {
            if (cashboxQueue.getIdsInQueue().contains(personId)) {
                int idInQueue = cashboxQueue.getIdsInQueue().indexOf(personId);
                Person newPerson = new Person("", personId);
                newPerson.setCafe(this);

                cashboxQueue.getQueue().set(idInQueue, newPerson);

                break;
            }
        }
    }

    public void updateQueues(ArrayList<Person> lastPeopleInQueues) {
        for(Person lastPerson: lastPeopleInQueues) {
            if(this.lastPersonThread != null) {
                try {
                    this.lastPersonThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            lastPerson.setName("mythread-" + lastPerson.getPersonId());
            this.lastPersonThread = lastPerson;
            lastPerson.start();
        }

        for(Person person: lastPeopleInQueues) {
            this.updatePersonThread(person.getPersonId());
        }
    }

    public ArrayList<Person> getAllLastPeople() {
        return this.Queues.stream()
                .map(cashboxQueue -> cashboxQueue.getQueue().get(cashboxQueue.getQueueLength() - 1))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public boolean peopleThreadsAreFinished(ArrayList<Person> lastPeople) {
        return lastPeople.stream().noneMatch(Thread::isAlive);
    }

    public void addCustomer(Person newPerson) {
        newPerson.setCafe(this);
        this.Queues.get(this.getMinQueueIndex()).addToEnd(newPerson);
    }

    public void removeCustomer() {
        this.Queues.get(new Random().nextInt(this.Queues.size())).removeFirst();
    }

    public int getNextPersonId() {
        int nextId = 0;

        for(Queue cashboxQueue: this.Queues) {
            nextId += cashboxQueue.getQueueLength();
        }

        return nextId;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Queue cashboxQueue: this.Queues) {
            stringBuilder.append(cashboxQueue.getQueueId()).append(" | ");

            for(Person person: cashboxQueue.getQueue()) {
                stringBuilder.append(person.getPersonId()).append(" ");
            }

            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
