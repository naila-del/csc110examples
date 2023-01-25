package videoexamples.module03;

public class ForLoop {
	public static void main(String[] args) {
		
		// Loop from 1 to 10
		System.out.print("Loop 1-10s: ");
		for(int ii=1;ii<=10;ii++) {
			System.out.print(ii + " ");
		}
		System.out.println();
	
		// Loop from 0 to 30 by 2's
		//  Note that the <30 condition means 30 will be excluded
		System.out.print("Loop 0-30 by 2's: ");
		for(int ii=0;ii<30;ii+=2) {
			System.out.print(ii + " ");
		}
		System.out.println();
		
		// Loop 20 down to 11 
		System.out.print("Loop 20 down to 11: ");
		for(int ii=20;ii>10;ii--) {
			System.out.print(ii + " ");
		}
		System.out.println();
		
		
	}

}
