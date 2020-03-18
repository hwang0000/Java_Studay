package thread.demo;

public class Producer implements Runnable {

	Basket basket;

	public Producer(Basket basket)
	{
		this.basket = basket;
	}

	@Override
	public void run()
	{
		while (true)
		{
			try
			{
				synchronized (basket)
				{
					basket.setCount(basket.getCount() + 1);
					System.out.println("水果剩余" + basket.getCount() + ",生产水果中......");
					basket.notify();
				}
				Thread.sleep(5000);
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
