package queue;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(12);
		mq.enqueue(11);
		mq.enqueue(10);
		mq.enqueue(13);
		mq.enqueue(14);
		mq.enqueue(15);

		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());

		mq.enqueue(25);
		
		System.out.println(mq.dequeue());
		
	}

}
