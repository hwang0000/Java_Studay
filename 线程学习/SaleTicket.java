package thread;

/**
 * 卖票窗口
 * 
 * @author hwang
 *
 */
public class SaleTicket extends Thread {
	/**
	 * 窗口名
	 */
	private String name;
	/**
	 * 定义共享数据，共100张票
	 */
	static int ticket = 100;
	/**
	 * 锁对象
	 */
	static Object obj = new Object();

	public SaleTicket(String name)
	{
		this.name = name;
	}

	@Override
	public void run()
	{
		while (true)
		{
			// 线程并发问题
			synchronized (obj)// 给代码块上锁
			{
				if (ticket > 0)
					System.out.println(name + "卖出的座位是" + (101 - ticket--));
				else
					break;
			}
			try
			{
				Thread.sleep(100);
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(name + "售空");
	}
}
