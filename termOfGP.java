import java.util.*;
import java.io.*;

class Solution
{
    
    public double termOfGP(int A,int B,int N)
    {
        //Your code here
        if(N==1){
            return A;
        }
        return termOfGP(A,B,N-1)*B/A;
    }

}
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();//first term
    int B=sc.nextInt();//second term
    int N=sc.nextInt();//the Nth term to find
    Solution obj=new Solution();
    System.out.println((int)Math.floor(obj.termOfGP(A,B,N)));
  }
}
