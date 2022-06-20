package producerConsumerProblem;

/*
    In this demo, I am going to show you the producer-consumer Java problem by using an example:
    In my demo, I have the following classes:
    1. Box class: this is a milk box for storage milk by producer, while consumer can milk
                  from the same box.
    2.Producer: this class will implement runnable interface and override run() method. And producer
               can call the method in Box to store the milk.
    3.Customer: this class will implement runnable interface and override run() method. And the customer
                can get the milk from the box.
    4.BoxDemo: main method will be in this class. And I will create 2 threads in main.
 */

public class BoxDemo {
    public static void main(String[] args) {
        Box b=new Box();

        Producer p=new Producer(b);
        Customer c=new Customer(b);

        Thread t1=new Thread(p);
        Thread t2=new Thread(c);

        t1.start();
        t2.start();

    }
}
