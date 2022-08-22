class Solution
{
    // You need to insert the given element at the given index. 
    // After inserting the elements at index, elements
    // from index onward should be shifted one position ahead
    // You may assume that the array already has sizeOfArray - 1
    // elements.
    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        //Your code here, Geeks
        int temp=0;
        for(int i=sizeOfArray-1;i>index;i--){ //traverse the array in reverse till the index to be changed
            arr[i]=arr[i-1];  //moving the elements to their adjacent position to make room for the new array element
        }  
        arr[index]=element;  //after coming out from the for loop(after moving the elements). insert the element in the index position.
    }


}
