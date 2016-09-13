package extends_key_word;

public class Sub extends Base{
	private int num;
	private String name = "name1";
	public int num1 = 100;
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
	public String message(String s1,String s2){
		System.out.println("Sub class public method : "+s1+" : "+s2);
		return s1+s2;
	}
}
