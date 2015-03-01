import java.util.Scanner;
public class Locker
{static int books=3, right, left, otherRight, firstRight, secondLeft, thirdRight;
	public static void putBookInLocker()
	{
		System.out.println(" locker has "+(books)+" extra books");
		//System.out.println("locker now has "+(books+1)+" instead of "+books+" in the locker");
	}
	public static void openLocker()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Input your 3 number locker combination");
		 firstRight=input.nextInt();
		 secondLeft=input.nextInt();
		 thirdRight=input.nextInt();
		
		CombinationLock.openLock(firstRight, secondLeft,thirdRight);
		int reset=CombinationLock.resetDial();	
		System.out.println("combination lock reset to "+reset);
	}
	
	public static boolean removeBookFromLocker()
	{
		//int move =(int)(Math.random() *2);
		if (Locker.firstRight==MainClass.Mright&&Locker.secondLeft==MainClass.Mleft
				&&Locker.thirdRight==MainClass.MotherRight || 
		(Locker.firstRight==MainClass.Dright&&Locker.secondLeft==MainClass.Dleft
		&&Locker.thirdRight==MainClass.DotherRight))
		{
			System.out.println("1 book has been removed");
			return true;
		}
		System.out.println("1 book has not been removed");
		return false;
	}
	
}
