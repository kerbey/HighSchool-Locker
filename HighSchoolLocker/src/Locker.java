import java.util.Scanner;
public class Locker
{
	private  int firstRight, secondLeft, thirdRight;
	public int getFirstRight() 
	{
		return firstRight;
	}

	public void setFirstRight(int firstRight)
	{
		this.firstRight = firstRight;
	}

	public int getSecondLeft()
	{
		return secondLeft;
	}

	public void setSecondLeft(int secondLeft)
	{
		this.secondLeft = secondLeft;
	}

	public int getThirdRight()
	{
		return thirdRight;
	}

	public void setThirdRight(int thirdRight)
	{
		this.thirdRight = thirdRight;
	}

	public  void putBookInLocker()
	{
		System.out.println(" locker has 3 extra books");
	}

	public void openLocker()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Input your 3 number locker combination");
		setFirstRight(input.nextInt());
		setSecondLeft(input.nextInt());
		setThirdRight(input.nextInt());
		CombinationLock combo= new CombinationLock();
		combo.openLock(getFirstRight(), getSecondLeft(),getThirdRight());
		combo.resetDial();	
	}

	public  boolean removeBookFromLocker()
	{
		CombinationLock combo= new CombinationLock();
		if(combo.getMfirstRight()==0 &&combo.getMsecondLeft()==0 &&combo.getMthirdRight()==0
				||combo.getDfirstRight()==0 &&combo.getDsecondLeft()==0 &&combo.getDthirdRight()==0)
		{
			System.out.println("1 book has been removed successfully");
			return true;
		}
		return false;
	}

}
