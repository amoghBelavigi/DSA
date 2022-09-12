class StrongestNeighbour{
    
    // Function to find maximum for every adjacent pairs in the array.
    static void maximumAdjacent(int sizeOfArray, int arr[]){
        
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<sizeOfArray;i++){
            int x=Math.max(arr[i-1],arr[i]);
            list.add(x);
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
