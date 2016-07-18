
public class FindUnique {

	public static void main(String[] args) {
      int arr[] = {2,2,2,2,3};
      int non=arr[0];
		int count=0;
		System.out.println("The Unique value in the given Array is: ");
		for(int counting=0;counting<arr.length;counting++){
			count=0;
			non=arr[counting];
		for(int i=counting+1;i<arr.length;i++){
			if(non==arr[i]){
				arr[i]='r';
				count++;
			}
			else{
				continue;
			}
			}
		if(count>0){
			arr[counting]='r';
		}
		}
		for(int j=0;j<arr.length;j++){
			if(arr[j]=='r'){
				continue;
			}
			else{
				System.out.println(arr[j]);
				break;
			}
		}
	}
}
