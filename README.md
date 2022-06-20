# Producer-Consumer-Problem-in-Java-Multi-Threading

The Producer-Consumer Problem is a classical concurrency problem and in fact, it is one of the most powerful concurrency design patterns which is used in most multithreaded Java applications.
The problem describes two processes, the producer and the consumer, which share a common, fixed-size buffer used as a queue. The producer's job is to generate data, put it into the buffer, and start again. At the same time, the consumer is consuming the data (i.e. removing it from the buffer), one piece at a time.

In this demo, I will show you how to solve the producer-consumer problem by using an example:
the producer here will produce milks, and the milkman will put the milk in a box.
Consumer can get the milk from the box.
