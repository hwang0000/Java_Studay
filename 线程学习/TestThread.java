package thread;
/**
 * �̳�ʵ���߳�
 * @author hwang
 *
 */
public class TestThread extends Thread {

	@Override
	public void run()
	{
		System.out.println(this.getName() + "���߳�����");
		System.out.println(this.getName() + "���̴߳���" + 1);
		System.out.println(this.getName() + "���̴߳���" + 2);
		System.out.println(this.getName() + "���̴߳���" + 3);
		System.out.println(this.getName() + "���̴߳���" + 4);
		System.out.println(this.getName() + "���̴߳���" + 5);
		System.out.println(this.getName() + "���̴߳���" + 6);

	}
}
