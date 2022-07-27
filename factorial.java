import java.util.*;
public class Main
{
    static void factorial(int n){
        int result=1;
        for (int i=2;i<=n;i++){
            result=result*i;
        }
        System.out.println("The factorial of "+n+" is "+result);
    }
    
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to find the factorial of: ");
		int n=sc.nextInt();
		factorial(n);
	}
}
