import java.util.Scanner;

public class Descending {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int [] a = {10, 12, 13, 4, 100};
		boolean flag=true;
		while(flag) {
			
		flag=false;
		for(int i =0; i < a.length-1; i++) {
			if(a[i] < a[i+1]) {
				int b = a[i];
				a[i] = a[i+1];
				a[i+1] = b;
				flag=true;
			}
			//System.out.println(a[i]);
			
		}
		}
		for(int i=0; i<= a.length-1; i++) {
		System.out.println(a[i]);
			
	
		}
	}
}
