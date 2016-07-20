import java.util.Arrays;
import java.util.Scanner;


public class LeastNumber {

	public void leastNumber(){
		int size;
		int digit;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		size=s.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the number");
		for(int i=0;i<size;i++){
			
			array[i]=s.nextInt();
		}
		System.out.println("Enter the digit to delete ");
		digit = s.nextInt();
		Arrays.sort(array);
		for(int i=0;i<size-digit;i++){
			System.out.print(array[i]);
		}
		s.close();
	}
	public static void main(String[] args) {
	 LeastNumber l =new LeastNumber();
	 l.leastNumber();
	
	 }

}
