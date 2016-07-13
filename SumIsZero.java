import java.util.Scanner;
public class SumIsZero {
	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
	  int array[] = new int[2];
	  System.out.println("Enter the size of an array");
	  int size = s.nextInt();
	  System.out.println("Enter " + size +" elements ");
	  for(int i=0;i<size ;i++){
		  array[i]=s.nextInt();
	  }
	  for(int i=0;i<size-1;i++){
		  for(int j=i+1;j<size;j++){
			  if(array[i]+array[j]==0){
				  System.out.println("The numbers whose sum is zero are "+ array[i]+ " "+ array[j]);
				  break;
			  }else{
				  System.out.println("The sum of the elements cannot be zero");
			  }
		  }
	  }
	  
	  s.close();
	}

}
