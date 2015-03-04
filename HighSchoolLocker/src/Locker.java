public class MainClass
{
	static byte Mright=28, Mleft=17,MOtherRight=39,MickeysBooks=3, DonaldsBooks=1,
			Dright=16, Dleft=35, DOtherRight=27,lockerArray[][]=new byte[3][2];
	public static void main(String []args)
	{
		lockerArray[0][0]=Mright;
		lockerArray[0][1]=Mleft;
		lockerArray[1][0]=MOtherRight;
		lockerArray[1][1]=Dright;
		lockerArray[2][0]=Dleft;
		lockerArray[2][1]=DOtherRight;
		System.out.println("locker 100 given to Mickey Mouse. "
				+ "\nThe Combination for this locker is "+lockerArray[0][0]+", "+lockerArray[0][1]+", "+lockerArray[1][0]);

		System.out.println("The locker has "+MickeysBooks+" book(s).");
		System.out.println("Try to open Mickey's locker by using the combination 15, 18, 18");
		Locker lock= new Locker();
		lock.openLocker();//goes to method for user to enter combination then goes to method openlock in
		//in the combination class to see if the combination matches. if it does then it goes to removeBookFromLocker
		//method, opens and 3 books are added and resetdial method resets it to zero
		//if not the locker fails to open and the combination is reset to zero

		System.out.println("locker 275 given to Donald Duck. "
				+ "\nThe Combination for this locker is "+lockerArray[1][1]+", "+lockerArray[2][0]+", "+lockerArray[2][1]);

		System.out.println("This locker has "+DonaldsBooks+" book(s).");
		System.out.println("Try to open Donald's locker by using the combination 15, 14, 13");
		lock.openLocker();//goes to method for user to enter combination then goes to method openlock in
		//in the combination class to see if the combination matches. if it does then it goes to removeBookFromLocker
		//method, opens and 3 books are added and resetdial method resets it to zero
		//if not the locker fails to open and the combination is reset to zero
	}
}
