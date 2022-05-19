// to print the peak element in an array
// Sliding window technique is used for this problem (of window size 3)
/* peak element- if a perticular array element is greater than its adjacent elements(element to its right and the element to its left)
        		 then it is called a peak element*/

import java.util.*;


class Peakelement{
    public static void peakele(int[] arr,int n){  
        int peak;  //init an integer variable called peak, which hoolds the peak value of the array
        for(int i=0;i<i+2;i++){  //sliding window
            //this below if works only for peak elemets present anywhere in the array except the start and the end position
            if(arr[i+1]>arr[i]&&arr[i+1]>arr[i+2]){  //to check if the array element is greater than its adjacent elements
                peak=arr[i+1];  //assigining the found element to peak
                System.out.println("(line 9)The peak elemets is: "+peak);  //printing it out
                break;
            }
            else{
                peakeleStartEnd(arr,n);  //this calls a function "peakeleStartEnd" with the arguments-
            }                            //which is present in the same class
        }
    }
    /*this whole function "peakeleStartEnd" is just to see if there exists an array elemet
    at the start or at the end of the array*/
    public static void peakeleStartEnd(int[] arr, int n){  
        int startPeak;  //init an integer variable to store if peak ele is found at the start
        int endPeak;  //init an integer variable to store if peak ele is found at the end
        if(arr[0]>arr[1]){  //comparing the first elemet to the second
            startPeak=arr[0];
            System.out.println("(line 23)The peak elemets is: "+startPeak);
        }
        else if (arr[n-1]>arr[n-2]){  //comparing the last elemet with the second last elemet
            endPeak=arr[n-1];
            System.out.println("(line 28)The peak elemets is: "+endPeak);
        } 
    }
}


public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:  ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elemets: ");
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		Peakelement peak=new Peakelement();
		Peakelement.peakele(arr, n);
	}
}
