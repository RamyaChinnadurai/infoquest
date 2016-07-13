import java.util.Scanner;
public class RepeatElementsInArray {
	public static void main(String[] args) {
       int array[] = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements in the array ");
        for(int i=0;i<array.length;i++){
        	array[i]  = s.nextInt();
        }
        for(int i=0;i<array.length;i++){
        	for(int j=i+1;j<array.length;j++){
        		if(array[i]==array[j] && i!=j){
        			System.out.println("The repeated elements in the array is " + array[j]);
        		}
        	}
        }
	  s.close();
	}
}
