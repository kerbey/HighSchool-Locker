
public class MainClass
{
	static int Mright=CombinationLock.turnRight();
	static int Mleft=CombinationLock.turnLeft();
	static int MotherRight=CombinationLock.turnRight();
	static int MickeysBooks=3, DonaldsBooks=1;
	static int Dright=CombinationLock.turnRight();
	static int Dleft=CombinationLock.turnLeft();
	static int DotherRight=CombinationLock.turnRight();
	public static void main(String []args)
	{
		System.out.println("locker 100 given to Mickey Mouse. "
				+ "\nThe Combination for this locker is "+Mright+", "+Mleft+", "+MotherRight);

		System.out.println("The locker has "+MickeysBooks+" book(s).");
		System.out.println("Try to open Mickey's locker by using the combination 15, 18, 18");
		Locker.openLocker();

		System.out.println("locker 275 given to Donald Duck. "
				+ "\nThe Combination for this locker is "+Dright+", "+Dleft+", "+DotherRight);

		System.out.println("This locker has "+DonaldsBooks+" book(s).");
		System.out.println("Try to open Donald's locker by using the combination 15, 14, 13");
		Locker.openLocker();
	}

}
