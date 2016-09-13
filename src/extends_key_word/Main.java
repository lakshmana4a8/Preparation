package extends_key_word;

public class Main {
	public static void main(String[] args) {
		Base base = new Base();
		Sub sub1 = new Sub();
		Base sub2 = new Sub();
		System.out.println(base.getNum()+" : "+base.num1+" : "+base.getName()+" : "+base.message("h", "i")+" : "+base.message1("h", "i"));
		System.out.println(sub1.getNum()+" : "+sub1.num1+" : "+sub1.getName()+" : "+sub1.message("h", "i")+" : "+sub1.message1("h", "i"));
		System.out.println(sub2.getNum()+" : "+sub2.num1+" : "+sub2.getName()+" : "+sub2.message("h", "i")+" : "+sub2.message1("h", "i"));
	}
}
