public class CombinationLock
{
	private int MfirstRight, MsecondLeft, MthirdRight,
	 DfirstRight, DsecondLeft, DthirdRight;
	public int getMfirstRight()
	{
		return MfirstRight;
	}
	public void setMfirstRight(int mfirstRight)
	{
		MfirstRight = mfirstRight;
	}
	public int getMsecondLeft()
	{
		return MsecondLeft;
	}
	public void setMsecondLeft(int msecondLeft)
	{
		MsecondLeft = msecondLeft;
	}
	public int getMthirdRight()
	{
		return MthirdRight;
	}
	public void setMthirdRight(int mthirdRight)
	{
		MthirdRight = mthirdRight;
	}
	public int getDfirstRight()
	{
		return DfirstRight;
	}
	public void setDfirstRight(int dfirstRight)
	{
		DfirstRight = dfirstRight;
	}
	public int getDsecondLeft()
	{
		return DsecondLeft;
	}
	public void setDsecondLeft(int dsecondLeft)
	{
		DsecondLeft = dsecondLeft;
	}
	public int getDthirdRight()
	{
		return DthirdRight;
	}
	public void setDthirdRight(int dthirdRight)
	{
		DthirdRight = dthirdRight;
	}
	public   void resetDial()
	{
		System.out.println("combination lock reset to 0");
	}
	public  int turnLeft(int CURRENTPOSITION, int COMBINATION)
	{
		int LEFT=(39 - (COMBINATION -  CURRENTPOSITION))%39;
		//39-(39-28)%39 or 39-(28-28)%39
		return LEFT;
	}
	public  int turnRight(int CURRENTPOSITION, int COMBINATION)
	{
		int  RIGHT=((COMBINATION -  CURRENTPOSITION)+39)%39;
		//(17-17)+39%39
		return RIGHT;
	}
	public  boolean openLock(int firstRight, int secondLeft, int thirdRight)
	{
		 setMfirstRight(turnRight(firstRight, MainClass.lockerArray[0][0]));
		 setMsecondLeft(turnLeft(secondLeft, MainClass.lockerArray[0][1]));
		 setMthirdRight(turnRight(thirdRight, MainClass.lockerArray[1][0]));
	
		 setDfirstRight(turnRight(firstRight, MainClass.lockerArray[1][1]));
		 setDsecondLeft(turnLeft(secondLeft, MainClass.lockerArray[2][0]));
		setDthirdRight(turnRight(thirdRight, MainClass.lockerArray[2][1]));
		//combinations and guesses are passed in the turnleft and turnright
		//methods then below the answers have to be 0 for the lock to open
		if (getMfirstRight()==0&&getMsecondLeft()==0&&getMthirdRight()==0)
		{
			System.out.println("locker opened");
			Locker lock= new Locker();
			lock.putBookInLocker();
			return true;
		}
	
		else if (getDfirstRight()==0&&getDsecondLeft()==0&&getDthirdRight()==0)
		{
			System.out.println("locker opened");
			Locker lock= new Locker();
			lock.removeBookFromLocker();
			return true;
		}
		else
		{
			System.out.println("locker failed to open");
			return false;
		}
	}
}
