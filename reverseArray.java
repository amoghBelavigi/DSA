//to reverse the array
//swaping the first and last elemets with the help of temp

import java.util.*;

class reversearray {
    public void reverse(int arr1[]) {
        int start=0;  //a pointer to point at the start of the array
        int end = arr1.length-1;  //a pointer to point at the end of the array
        int temp;  //init a temp to swap
        while(start<end) {  
            temp=arr1[start];  //the first ele in the array to store in the temp
            arr1[start]=arr1[end];  //the last ele in the array to be stored in the first ele's place
            arr1[end]=temp;  //the ele in the temp to be stored in the last position
            start++;  //increment the start
            end--;  //decrecment the endd
        }
         
    }
    void printreversearray(int arr1[]) {
        System.out.println("The reversed  array is:");
        for(int i=0;i<arr1.length;i++) {
            System.out.print(arr1[i]+" ");
        }
        
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
		reversearray reversearray1 = new reversearray();  //creating an object 'reversearray1' of the class reversearray
		System.out.println("Enter the size of the array:");
		int n=input.nextInt();
        int arr1[]= new int[n];
        System.out.println("Enter the elemets of the array:");
        for(int i=0;i<n;i++) {
            arr1[i]=input.nextInt();
        }
        
        reversearray1.reverse(arr1);  //passing the array 'arr1' in the function 'reverse' of class 'reversearray1'
        reversearray1.printreversearray(arr1); //passing the array in the printing fuction
	}
}
