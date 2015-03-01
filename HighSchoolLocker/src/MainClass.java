public class MainClass
{
	//locker combinations are set for mickey and donald through the methods turn left and 
	//turn right in the combination lock class
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
		Locker.openLocker();//goes to method for user to enter combination then goes to method openlock in
		//in the combination class to see if the combination matches. if it does then it goes to removeBookFromLocker
		//method, opens and 3 books are added and resetdial method resets it to zero
		//if not the locker fails to open and the combination is reset to zero

		System.out.println("locker 275 given to Donald Duck. "
				+ "\nThe Combination for this locker is "+Dright+", "+Dleft+", "+DotherRight);

		System.out.println("This locker has "+DonaldsBooks+" book(s).");
		System.out.println("Try to open Donald's locker by using the combination 15, 14, 13");
		Locker.openLocker();//goes to method for user to enter combination then goes to method openlock in
		//in the combination class to see if the combination matches. if it does then it goes to removeBookFromLocker
		//method, opens and 3 books are added and resetdial method resets it to zero
		//if not the locker fails to open and the combination is reset to zero
	}
}
