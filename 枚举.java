public class helloworld {
	public static void main(String[] args)
	{
		System.out.println("hello world");

		Season season = Season.SPRING;
		season.showInfo();
	}
}

// 枚举
enum Season
{
	SPRING("春天", "春暖花开"), 
	SUMMER("夏天", "炎炎夏日"),
	AUTUMN("秋天", "秋高气爽"), 
	WINTER("冬天", "寒风凛冽");

	private final String name;
	private final String desc;

	private Season(String name, String desc)
	{
		this.desc = desc;
		this.name = name;
	}

	public void showInfo()
	{
		System.out.println(this.name + ":" + this.desc);
	}
}
