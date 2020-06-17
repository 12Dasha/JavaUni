package Lab11;

import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class Person extends Thread{
    private String name;
    private  int id;
    private Cafe cafe;
    private ReentrantLock lock;
    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getPersonName(){
        return name;
    }
    public int getPersonId() {
        return id;
    }
    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    public Queue getCashboxQueue() {
        for (Queue cashboxQueue: this.cafe.getCashboxQueues()) {
            if (cashboxQueue.getIdsInQueue().contains(this.id)) {
                return cashboxQueue;
            }
        }

        return null;
    }

    @Override
    public void run() {
        this.lock.lock();
            if (this.getCashboxQueue().getQueueLength() != this.cafe.getMinQueueSize()) {
                this.cafe.getCashboxQueues().get(this.cafe.getMinQueueIndex()).addToEnd(
                        this.getCashboxQueue().getQueue().get(this.getCashboxQueue().getQueueLength() - 1)
                );
                this.getCashboxQueue().removeLast();
            }
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
