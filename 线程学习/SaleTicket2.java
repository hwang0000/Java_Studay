package thread;

public class SaleTicket2 implements Runnable {

	/**
	 * 定义共享数据，共100张票
	 */
	int ticket = 100;
//	/**
//	 * 锁对象
//	 */
//	Object obj = new Object();

	@Override
	public void run()
	{
		while (true)
		{
			// // 线程并发问题
			// synchronized (obj)// 给代码块上锁
			// {
			// if (ticket > 0)
			// System.out.println(Thread.currentThread().getName() + "卖出的座位是" + (101 -
			// ticket--));
			// else
			// break;
			// }
			if (ticketIsLeft())
				break;
			try
			{
				Thread.sleep(100);
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "售空");
	}

	private synchronized boolean ticketIsLeft()
	{
		boolean isLeft = false;
		if (ticket > 0)
			System.out.println(Thread.currentThread().getName() + "卖出的座位是" + (101 - ticket--));
		else
			isLeft = true;
		return isLeft;
	}

}
