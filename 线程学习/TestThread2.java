package thread;

/**
 * �ӿ�ʵ���߳�
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
		System.out.println(this.name + "���߳�����");
		System.out.println(this.name + "���̴߳���" + 1);
		System.out.println(this.name + "���̴߳���" + 2);
		System.out.println(this.name + "���̴߳���" + 3);
		System.out.println(this.name + "���̴߳���" + 4);
		System.out.println(this.name + "���̴߳���" + 5);
		System.out.println(this.name + "���̴߳���" + 6);
	}

}
