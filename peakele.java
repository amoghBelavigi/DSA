import java.util.*;

class Peakelement{
    public static void peakele(int[] arr,int n){
        int peak;
        for(int i=0;i<i+2;i++){
            if(arr[i+1]>arr[i]&&arr[i+1]>arr[i+2]){
                peak=arr[i+1];
                System.out.println("(line 9)The peak elemets is: "+peak);
                break;
            }
            else{
                peakeleStartEnd(arr,n);
            }
        }
    }
    public static void peakeleStartEnd(int[] arr, int n){
        int start;
        int end;
        if(arr[0]>arr[1]){  
            start=arr[0];
            System.out.println("(line 23)The peak elemets is: "+start);
        }
        else if (arr[n-1]>arr[n-2]){  
            end=arr[n-1];
            System.out.println("(line 28)The peak elemets is: "+end);
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
