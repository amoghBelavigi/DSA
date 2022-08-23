
  //Function to find median of the array elements.  
  public int median(int A[],int N)
    {
       double median=0;
       Arrays.sort(A);
       
       //Your code here
       //If median is fraction then conver it to integer and return
       if (N % 2 != 0){
            median= (double)A[N / 2];
            return (int)Math.floor(median);
       }
       else{
            median= (double)(A[(N - 1) / 2] + A[N / 2]) / 2.0;
            return (int)Math.floor(median);
       }
       
    }
    //Function to find median of the array elements.
    public int mean(int A[],int N)
    {
       //Your code here
        int sum = 0;
        for (int i = 0; i < N; i++)
            sum += A[i];
 
        double mean= (double)sum / (double)N;
        return (int)mean;
    }

}
