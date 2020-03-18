package thread;

import java.util.Date;

public class Test {

	public static void main(String[] args)
	{
		// threadTest();
		// sale();
		// sale2();
		testSleep();
	}

	public static void threadTest()
	{
		Thread thread = new TestThread();
		thread.start();// 启动线程
		Thread t2 = new Thread(new TestThread2("thr1.0"));
		t2.start();
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("------------------");
	}

	public static void sale()
	{
		Thread window_1 = new SaleTicket("窗口1");
		Thread window_2 = new SaleTicket("窗口2");
		Thread window_3 = new SaleTicket("窗口3");
		Thread window_4 = new SaleTicket("窗口4");
		window_1.start();
		window_2.start();
		window_3.start();
		window_4.start();
	}

	public static void sale2()
	{
		SaleTicket2 st = new SaleTicket2();
		Thread window_1 = new Thread(st, "窗口1");
		Thread window_2 = new Thread(st, "窗口2");
		Thread window_3 = new Thread(st, "窗口3");
		Thread window_4 = new Thread(st, "窗口4");
		window_1.start();
		window_2.start();
		window_3.start();
		window_4.start();
	}

	public static void testSleep()
	{
		while (true)
		{
			System.out.println(new Date());
			try
			{
				Thread.sleep(2000);
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
