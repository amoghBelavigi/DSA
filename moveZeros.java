//to move all the zero elements to the end of the array
//while maintaining the relative order of the non zero elements

import java.util.*;


public class Main
{
    public static void printArray(int arr[], int n){   //to print the array
        System.out.println("The modified array is: ");
        for(int i=0;i<n;i++){
		    System.out.println(arr[i]+" ");
		}
		System.out.println();
    }
    
    public static void moveZeros(int[] arr,int n){
        int j=0; //focuses on zero elemets
        for(int i=0;i<n;i++){  //will focus on non zero elemets
            if(arr[i]!=0&&arr[j]==0){  //if i is not pointing to zero and j is pointing to a zero
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        printArray(arr,n);
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
		moveZeros(arr,n);
	}
}
