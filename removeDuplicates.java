import java.util.*;

public class Main
{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
        String str=sc.nextLine();
        removeDuplicates(str);
        
	}
    
    public static void removeDuplicates(String str){
        String ans="";
        ans=ans+str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                ans=ans+str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
