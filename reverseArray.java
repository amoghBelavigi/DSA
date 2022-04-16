class reversearray {
    public void perform(int arr1[]) {
        int start=0;
        int end = arr1.length-1;
        int temp;
        while(start<end) {
            temp=arr1[start];
            arr1[start]=arr1[end];
            arr1[end]=temp;
            start++;
            end--;
        }
         
    }
    void printreversearray(int arr1[]) {
        for(int i=0;i<arr1.length;i++) {
            System.out.println(arr1[i]);
        }
        
    }
}
public class Main
{
	public static void main(String[] args) {
		reversearray reversearray1 = new reversearray();
        int arr1[]= {1,2,3,4,5};
        
        reversearray1.perform(arr1);
        reversearray1.printreversearray(arr1);
	}
}
