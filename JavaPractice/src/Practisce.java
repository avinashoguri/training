
public class Practisce {

	
	public static void ifloop() {
		int n=10;
		if(n>10) {
			System.out.println("N>10");
		}else {
			if(n<=10) {
				System.out.println("N<=10");
			}else {
				System.out.println("N>10");
			}
			
		}
		
	}
	
	public static void Switchstmt(int n) {
		switch(n) {
		case 1:
			System.out.println("case 1");
			break;
		case 2 :
			System.out.println("case 2 ");
			break;
		default : System.out.println("default");
		}
	}
	public static void forloop(int n) {
		for(int i=0;i<n;i++) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		int[] num= {10,20,30,40,50};
		for(int x:num) {
			System.out.print(x +" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ifloop();
		Switchstmt(10);
		forloop(5);
	}
	
	

}
