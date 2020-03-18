package thread.demo;

public class Basket {

	private int count;

	public int getCount()
	{
		return count;
	}
	
	public boolean isEmpty()
	{
		if (count > 0)
			return false;
		else
			return true;
	}

	public void setCount(int count)
	{
		this.count = count;
	}
}
