package thread;

public class SaleTicket2 implements Runnable {

	/**
	 * ���干�����ݣ���100��Ʊ
	 */
	int ticket = 100;
//	/**
//	 * ������
//	 */
//	Object obj = new Object();

	@Override
	public void run()
	{
		while (true)
		{
			// // �̲߳�������
			// synchronized (obj)// �����������
			// {
			// if (ticket > 0)
			// System.out.println(Thread.currentThread().getName() + "��������λ��" + (101 -
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
		System.out.println(Thread.currentThread().getName() + "�ۿ�");
	}

	private synchronized boolean ticketIsLeft()
	{
		boolean isLeft = false;
		if (ticket > 0)
			System.out.println(Thread.currentThread().getName() + "��������λ��" + (101 - ticket--));
		else
			isLeft = true;
		return isLeft;
	}

}
