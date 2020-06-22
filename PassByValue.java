public class PassByValue
{
	public static void main(String[] args)
	{
		int x=0,y=0;

      		Test temp = new Test();

		System.out.println("\n=====Call By Value=========");

		System.out.println("Original X : " +x + "\t Y : " +y);

		updateValue(x,y);
                System.out.println("Updated X : " +x + "\t Y : " +y);

		 System.out.println("\n=====Call By Reference=========");

		System.out.println("Original X : " +temp.x + "\t Y : " + temp.y);

		updatePoint(temp);
		System.out.println("Updated X : " +temp.x + "\t Y : " + temp.y);

   	}

	public static void updatePoint(Test temp)
	{
      		temp.x = 500;
      		temp.y = 500;
   	}
	public static void updateValue(int x, int y)
	{
		x=700;
		y=700;
	}
}

class Test
{
   public int x=100, y=200;
}

