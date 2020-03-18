package thread;
/**
 * 继承实现线程
 * @author hwang
 *
 */
public class TestThread extends Thread {

	@Override
	public void run()
	{
		System.out.println(this.getName() + "多线程运行");
		System.out.println(this.getName() + "多线程代码" + 1);
		System.out.println(this.getName() + "多线程代码" + 2);
		System.out.println(this.getName() + "多线程代码" + 3);
		System.out.println(this.getName() + "多线程代码" + 4);
		System.out.println(this.getName() + "多线程代码" + 5);
		System.out.println(this.getName() + "多线程代码" + 6);

	}
}
