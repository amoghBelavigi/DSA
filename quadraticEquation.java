// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> roots= new ArrayList<>();
        double top=(b*b-4*a*c);
        if(top<0){
            roots.add(-1);
        }
        else{
            top=Math.sqrt(top);
            double n=(-b+top)/(2*a);
            double m=(-b-top)/(2*a);
            roots.add((int)Math.floor(Math.max(n,m)));
            roots.add((int)Math.floor(Math.min(n,m)));
        }
        return roots;
    }
}
