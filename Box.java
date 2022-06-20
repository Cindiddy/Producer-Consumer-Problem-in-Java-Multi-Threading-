package producerConsumerProblem;

public class Box {
    private int milk;
    //to track the state of the box
    private boolean isEmpty=true;

    //put and get milk methods
    public synchronized void put(int milk){
        //if the there is milk in the box, we need to wait for the customer to get the milk first
        if (!isEmpty){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //if the box is empty, we will produce milk
        this.milk=milk;
        System.out.println("The milkman put No."+this.milk+" milk into the box.");
        //after producing milk, we need to change the state of the box
        this.isEmpty=false;
        //wake up other thread
        notifyAll();
    }

    public synchronized void get(){
        //if there is no milk in the box, we need to wait for the production
        if(isEmpty){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //if there is any milk in the box,the customer can get the milk
        System.out.println("The customer get No."+this.milk+" milk from the box.");
        //change the state after getting the milk
        this.isEmpty=true;
        //wake up other threads
        notifyAll();
    }
}
