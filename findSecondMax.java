//to find the second maximum element in the array

import java.util.*;


public class Main
{
    static void findSecondMax(int[] arr,int n){  
        int max=0;  //init a max variable to zero
        int secondMax=0;  //init a seconMax variable to zero
        for(int i=0;i<n;i++){
		    if(arr[i]>max){  //if array ele is greater than max
		        secondMax=max;  //make the current max as the secondMax
		        max=arr[i];  //make the arrayb ele as the max value
		    }
		    else if (arr[i]>secondMax&&arr[i]!=max){  //if ele is greater than secondMax and also if ele is not the same as max
		        secondMax=arr[i];  //array ele is stored in secondMax
		    } 
		}
		System.out.println("the second max elemet is :"+secondMax);  //printing the secondMax
    }
    
    
    
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=input.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the array elemets: ");
		for(int i=0;i<n;i++){
		    arr[i]=input.nextInt();
		}
		findSecondMax(arr,n);  //calling function 'findSecondMax' with the arguments: array and size n
	}
}
