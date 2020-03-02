package extendsPractice;

/**
 * 单例模式
 * @author hwang
 */
public class Single {

	// public Single()
	// {
	// //很多行代码
	// //构建对象耗时
	// }

	// 私有的构造函数
	private Single()
	{
		// TODO 自动生成的构造函数存根
	}

	/**
	 * 饿汉式单例
	 */
	
	// 私有的single类型的类变量
	private static Single single = new Single();

	// 公有静态方法调用
	public static Single getInstance()
	{
		return single;
	}

	/**
	 * 懒汉式单例
	 */

	// 私有的single类型的类变量
	private static Single single2 = null;

	// 公有静态方法调用
	public static Single getInstance2()
	{
		if (single2 == null)
			single2 = new Single();
		return single2;
	}
}
