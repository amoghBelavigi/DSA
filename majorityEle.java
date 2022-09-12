class Solution {
    // Function to find element with more appearances between two elements in an
    // array.
    public int majorityWins(int arr[], int n, int x, int y) {
        // code here
        int xc=0;
        int yc=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                xc++;
            }
            else if(arr[i]==y){
                yc++;
            }
        }
        if(xc==yc){
            return (int)Math.min(x,y);
        }
        else if(xc>yc){
            return x;
        }
        else{
            return y;
        }
    }
}
