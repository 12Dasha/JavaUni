package Lab11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Queue {
    private ArrayList<Person> queue;
    private int queueId;

    public Queue(ArrayList<Person> queue, int queueId){
        this.queue = queue;
        this.queueId = queueId;
    }
    public ArrayList<Person> getQueue(){
        return this.queue;
    }
    public int getQueueId(){
        return  queueId;
    }
    public int getQueueLength(){
        return this.queue.size();
    }
    public ArrayList<Integer> getIdsInQueue() {
        return this.queue.stream()
                .map(Person::getPersonId)
                .collect(Collectors.toCollection(ArrayList::new));
    }
    public void removeFirst(){
        this.queue.remove(0);
    }
    public void removeLast() {
        this.queue.remove(this.queue.size() - 1);
    }

    public void addToEnd(Person newPerson) {
        this.queue.add(newPerson);
    }

}

