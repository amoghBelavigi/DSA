//the problem is to find all the 3 digit numbers that is equal to the sum of the cubes of the individual digits of the number
//eg: 153=(1^3)+(5^3)+(3^3)

public class Main
{
	public static void main(String[] args) {
	    for(int i=99;i<999;i++){  //for loop with the range from 99 to 999
		    int n=i/100; //divide the number by 100 to get the first digit (eg:153/100=1) 
		    int m=(i-(n*100));  //this is to get the last 2 digits, where the 100s are removed with and left with only 2nd and 3rd(eg:153-(1*100)=53)
    		int o=m/10;  //now divide the number  u get by 10 which gives us the quotent as the 2nd digit (eg:53/10=5)
	    	int p=m%10;  //now mod the 2 digit number to get the remiander as the 3rd digit (eg:53%10=3)
		    /*System.out.println(n); //printing the 1st digit saperately (eg:1)
	    	System.out.println(o);  //printing the 2nd digit saperately (eg:5)
	    	System.out.println(p);*/  //printing the 3rd digit saperately (eg:3)
		    if(i==((n*n*n)+(o*o*o)+(p*p*p))){  //checking the main criteria where the sum of the cubes of the individual digits is equal to the number (eg: 153=(1^3)+(5^3)+(3^3)) 
		        System.out.println(i);
		    }
	    }
	    
	}
}
