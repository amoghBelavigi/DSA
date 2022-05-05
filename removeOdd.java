//remove odd integers from an array
//keep only even integers in an array

import java.util.*;

public class Main
{
    
    public static int[] removeOdd(int[] arr){  //u have to return the array so "int[]" is used
        int evenCount=0;  //to count the number of odd numbers present in the array
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){ //to check if the integer is odd or no
                evenCount++;  //if odd then increment the oddCount
            }
        }
        int[] result=new int[evenCount];  //create a new result array to store only the odd elements of the array
        int idx=0; //take a pointer idx to point at the zeroth location of the array result
        for(int i=0;i<arr.length;i++){ 
            if(arr[i]%2==0){  //check again if the integer is odd or no
                result[idx]=arr[i];  //store the  integer in the result array
                idx++;  //increment the idx so that it goes to the next location of the result array and the next one can be stored there
            }
        }
        return result;  //return the  result array
    }
    
    
    public static void printArray(int[] arr) {
        System.out.println("The array elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void printResultArray(int[] arr) {
        System.out.println("The result array elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=input.nextInt();
		int[] arr=new int[n];  //init an array
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++){  //adding array elements
		    arr[i]=input.nextInt();
		}
		printArray(arr);
		int[] result=removeOdd(arr); 
		printResultArray(result);
	}
}