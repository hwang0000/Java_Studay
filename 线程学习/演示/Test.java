package thread.demo;

public class Test {
	public static void main(String[] args)
	{
		Basket basket = new Basket();
		basket.setCount(10);
		Producer producer = new Producer(basket);
		Thread producer1 = new Thread(producer);
		Thread producer2 = new Thread(producer);
		Thread producer3 = new Thread(producer);
		Customer customer = new Customer(basket);
		Thread customer1 = new Thread(customer, "顾客1");
		Thread customer2 = new Thread(customer, "顾客2");
		producer1.start();
		producer2.start();
		producer3.start();
		customer1.start();
		customer2.start();
	}
}
