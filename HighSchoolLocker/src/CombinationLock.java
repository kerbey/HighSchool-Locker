
public class CombinationLock
{
	static int position=0, right, left, otherRight;
	
	public static int resetDial()
	{
		position=0;
		return position;
	}
	public static int turnLeft()
	{
		position =(int)(Math.random() *39);
		position=position-10;
		//System.out.println("combination lock turns left "+position+" times");
		return position;
	}
	public static int turnRight()
	{
		position =(int)(Math.random() *39);
		//System.out.println("combination lock turns right "+position+" times");
		return position;
	}
    public static void openLock(int firstRight, int secondLeft, int thirdRight)
	{
    	
		if (Locker.firstRight==MainClass.Mright&&Locker.secondLeft==MainClass.Mleft
				&&Locker.thirdRight==MainClass.MotherRight)
		{
			System.out.println("locker succeeded to open");
			Locker.putBookInLocker();
		}
		
		else if (Locker.firstRight==MainClass.Dright&&Locker.secondLeft==MainClass.Dleft
				&&Locker.thirdRight==MainClass.DotherRight)
		{
			System.out.println("locker succeeded to open");
			Locker.removeBookFromLocker();
		}
		else 
		{
			System.out.println("locker did not open");
		}
	}
}
