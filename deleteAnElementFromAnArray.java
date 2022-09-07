import java. util.*;

class remove{
    public int[] removeEle(int [] arr, int n, int x){
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                for(int j=i;j<n-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        return arr;
    }
}

class printArr{
    static void printA(int arr[]){
        System.out.println("The resultant string is: ");
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
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
        System.out.println("Enter the element to be deleted");
        int x=sc.nextInt();
        remove obj=new remove();
        obj.removeEle(arr,n,x);
        printArr obj2=new printArr();
        obj2.printA(arr);
	}
}
