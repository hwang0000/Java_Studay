package extendsPractice;

/**
 * ����ģʽ
 * @author hwang
 */
public class Single {

	// public Single()
	// {
	// //�ܶ��д���
	// //���������ʱ
	// }

	// ˽�еĹ��캯��
	private Single()
	{
		// TODO �Զ����ɵĹ��캯�����
	}

	/**
	 * ����ʽ����
	 */
	
	// ˽�е�single���͵������
	private static Single single = new Single();

	// ���о�̬��������
	public static Single getInstance()
	{
		return single;
	}

	/**
	 * ����ʽ����
	 */

	// ˽�е�single���͵������
	private static Single single2 = null;

	// ���о�̬��������
	public static Single getInstance2()
	{
		if (single2 == null)
			single2 = new Single();
		return single2;
	}
}
