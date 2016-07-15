import java.util.Scanner;


public class ConcatnationOfInt {
	public static void main(String[] args) {
           int array[] = new int[4];
           int result=0;
           Scanner s = new Scanner(System.in);
           for(int i=0;i<array.length;i++){
        	   array[i]=s.nextInt();
           }
           for(int i=0;i<array.length;i++){
           	for(int j=i+1;j<array.length;j++){
           		if(array[i]<array[j]){
           		int swap = array[j];
           		array[j]= array[i];
           		array[i]=swap;
           		}
           	}
           }
           
           for(int i=0;i<array.length;i++){
        	   result = result*10 + array[i];
           }
           System.out.println(result);
           s.close();
	}

}
