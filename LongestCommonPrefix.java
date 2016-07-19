import java.util.Scanner;


public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		     String longestPrefix = "";
		   if(strs.length>0){
		       longestPrefix = strs[0];
		   }
		   for(int i=1; i<strs.length; i++){
		         String analyzing = strs[i];
		        int j=0;
		       for(; j<Math.min(longestPrefix.length(), strs[i].length()); j++){
		             if(longestPrefix.charAt(j) != analyzing.charAt(j)){
		                 break;
		            }
		       }
                 longestPrefix = strs[i].substring(0, j);
		    }
		     return longestPrefix;
		}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array String");
		String[] strs = new String[3];
		for(int i=0;i<strs.length;i++){
			strs[i]=s.next();
		}
		LongestCommonPrefix l = new LongestCommonPrefix();
		for(int i=0;i<strs.length;i++){
	    System.out.println(l.longestCommonPrefix(strs));
		}
        s.close();
	}

}
