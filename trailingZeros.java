//this problem is about finding the count of trailing zeros for the factorial of n

import java.util.*;

public class Main
{
    static int fact(int n, int res){
        for(int i=2;i<=n;i++){
            res=res*i;
        }
        return res;
    }
    
    static void zeros(int res){
        int count=0;
        while(res%10==0){
            count++;
            res=res/10;
        }
        System.out.println("The number of Trailing Zeros is: "+count);
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		int res=1;
		int res2=fact(n, res);
		zeros(res2);
	}
}
