class Solution{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        int max=0;
        int max2=-1;
        ArrayList<Integer>result=new ArrayList<Integer>();
            for(int i=0;i<arr.length;i++){
                if(max<arr[i]){
                    max=arr[i];
                }
            }  
            for(int i=0;i<arr.length;i++){
                if(arr[i]<max&&arr[i]>max2){
                    max2=arr[i];
                }  
            }
            result.add(max);
            result.add(max2);
       return result;
    }
}
