//to find the minimum value in an array

import java.util.*;

class Minimum{ //creating a class called Minimum
    public static void findMinimum(int[] arr, int n){  //creating a function 'findMinimum' and passing the array and the size of the array into it
	    if(arr==null||arr.length==0){  //if the input is an empty array then throw an excpetion
	        throw new IllegalArgumentException("Invalid input");
	    }
	    int min=arr[0]; //init a variable called 'min' to the first ele of the array
	    for(int i=0;i<n;i++){  
	        if(arr[i]<min){  
	            min=arr[i];
	        }
	    }
	    System.out.println("The minimum elemet in the array is: "+min);  //printing the minimum ele in the array
	}
}

public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=input.nextInt();
        int arr[]= new int[n];  //creating an array
        System.out.println("Enter the elemets of the array:");
        for(int i=0;i<n;i++) {
            arr[i]=input.nextInt();
        }
        Minimum mini=new Minimum();  //creating an object 'mini' of the class Minimum
        mini.findMinimum(arr,n);  //calling the 'findMinimum' function from the 'Minimum'  class and passing the array and the size of the array as the arguments
	}
}
