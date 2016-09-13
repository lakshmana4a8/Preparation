package miscellaneous;

//static keyword and static block usage
public class Test {
	static int cntr = 0;
	public Test() {
		System.out.println("constructor : "+cntr);
		cntr++;
		if (cntr > 2)
			throw new NullPointerException();
	}
	{
		System.out.println("static block : "+cntr);
	}
	public static void main(String args[]) {
		Test t1 = new Test();
		System.out.println("hello 1");
		Test t2 = new Test();
		System.out.println("hello 2");
		Test t3 = new Test();
	}
}
