package factoryPractice;

public class BWMFactoryImpl implements BWMFactory {

	@Override
	public BWM productBWM()
	{
		System.out.println("BWMFactory3");
		return new BWMImpl();

//		 System.out.println("BWMFactory4");
//		 return new BWM4Impl();
	}
}
