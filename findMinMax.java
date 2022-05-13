//to print the max and min value in an array

import java.util.*;

class MinMax{ 
    public static void findMinMax(int[] arr, int n){  
	    if(arr==null||arr.length==0){  //if the input is an empty array then throw an excpetion
	        throw new IllegalArgumentException("Invalid input");
	    }
	    int min=arr[0];  
	    for(int i=0;i<n;i++){  
	        if(arr[i]<min){  
	            min=arr[i];
	        }
	    }
	    int max=arr[0];
	    for(int i=0;i<n;i++){
	        if(arr[i]>max){
	            max=arr[i];
	        }
	    }
	    
	    System.out.println("The minimum elemet in the array is: "+min); 
	    System.out.println("The maximum elemet in the array is: "+max);
	}
}

public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=input.nextInt();
        int arr[]= new int[n];  
        System.out.println("Enter the elemets of the array:");
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        MinMax minmax=new MinMax();  //creating an object 'minmax' of the class Minimum
        minmax.findMinMax(arr,n);  //calling the 'findMinMax' function from the 'MinMax'  class and passing the array and the size of the array as the arguments
	}
}
