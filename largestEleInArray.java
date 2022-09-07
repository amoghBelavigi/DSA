import java. util.*;

class largest{
    static void largestEle(int [] arr, int n){
        int curr=0;
        for(int i=0;i<n;i++){
            if(arr[i]>curr){
                curr=arr[i];
            }
        }
        System.out.println("The largest element is: "curr);
    }
}

public class Main
{   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the array:");
	    int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        largest obj=new largest();
        obj.largestEle(arr,n);
	}
}
