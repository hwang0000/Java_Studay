package thread;

/**
 * 接口实现线程
 * @author hwang
 *
 */
public class TestThread2 implements Runnable {

	private String name;
	public TestThread2(String name)
	{
		this.name = name;
	}
	
	@Override
	public void run()
	{
		System.out.println(this.name + "多线程运行");
		System.out.println(this.name + "多线程代码" + 1);
		System.out.println(this.name + "多线程代码" + 2);
		System.out.println(this.name + "多线程代码" + 3);
		System.out.println(this.name + "多线程代码" + 4);
		System.out.println(this.name + "多线程代码" + 5);
		System.out.println(this.name + "多线程代码" + 6);
	}

}
