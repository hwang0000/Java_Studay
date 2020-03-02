package factoryPractice;

public class Test {

	public static void main(String[] args)
	{
		/**
		 * 工厂模式
		 * 通过工厂隔离了new对象，通过产品接口可以接受不同实际产品的实现类
		 * 程序员A负责开发实现bwm类，且可随意更改
		 * 程序员B负责使用(即test里面的代码编写)，A修改不影响B使用，B不需要任何更改
		 */
		// TODO 自动生成的方法存根
		BWM b3 = new BWMFactoryImpl().productBWM();
		b3.showInfo();
		
//		BWM b4 = new BWMFactoryImpl().productBWM();
//		b4.showInfo();
	}
}
