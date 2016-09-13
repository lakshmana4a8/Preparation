package extends_key_word;

public class Base {
	private int num = 1;
	private String name = "name";
	public int num1 = 10;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String message1(String s1,String s2){
		System.out.println("Base class public method message1 : "+s1+" : "+s2);
		return s1+s2;
	}
	public String message(String s1,String s2){
		System.out.println("Base class public method message : "+s1+" : "+s2);
		return s1+s2;
	}
}
