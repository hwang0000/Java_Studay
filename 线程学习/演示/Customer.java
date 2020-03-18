package thread.demo;

public class Customer implements Runnable {

	Basket basket;

	public Customer(Basket basket)
	{
		this.basket = basket;
	}

	@Override
	public void run()
	{
		while (true)
		{
			synchronized (basket)
			{
				try
				{
					if (basket.isEmpty())
					{
						// 线程挂起等待
						basket.wait();
					}else {
						basket.setCount(basket.getCount() - 1);
						System.out.println(Thread.currentThread().getName() + "购买水果,剩余水果" + basket.getCount());
					}

				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			try
			{
				Thread.sleep(1000);
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
