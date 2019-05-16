package aa;

public class hh {
	public static void main(String[] args) {
		String a="ncsnc";
		Integer b=2;
		Boolean c=true;
		System.out.println(a.getClass());
		System.out.println(b.getClass());
		System.out.println(c.getClass());
		
		if(b instanceof Integer && b==1) {
			System.out.println("success");
		}else {
			System.out.println("false");
		}
		
		String d="6";
		Integer d1=(Integer)d.indexOf(d);
		System.out.println(d1.getClass());
	}
}
