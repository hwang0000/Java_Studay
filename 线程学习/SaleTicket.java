package thread;

/**
 * ��Ʊ����
 * 
 * @author hwang
 *
 */
public class SaleTicket extends Thread {
	/**
	 * ������
	 */
	private String name;
	/**
	 * ���干�����ݣ���100��Ʊ
	 */
	static int ticket = 100;
	/**
	 * ������
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
			// �̲߳�������
			synchronized (obj)// �����������
			{
				if (ticket > 0)
					System.out.println(name + "��������λ��" + (101 - ticket--));
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
		System.out.println(name + "�ۿ�");
	}
}
