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
						// �̹߳���ȴ�
						basket.wait();
					}else {
						basket.setCount(basket.getCount() - 1);
						System.out.println(Thread.currentThread().getName() + "����ˮ��,ʣ��ˮ��" + basket.getCount());
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
