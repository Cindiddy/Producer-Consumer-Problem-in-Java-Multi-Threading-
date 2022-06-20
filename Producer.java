package producerConsumerProblem;

public class Producer implements Runnable{
    private Box b;

    public Producer(Box b) {
        this.b = b;
    }

    @Override
    public void run(){
        for (int i=0;i<10;i++){
            b.put(i);
        }
    }
}
