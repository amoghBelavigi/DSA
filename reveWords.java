public class Main
{
	public static void main(String[] args) {
		String str="h ello";
		String revstr="";
		String [] words=str.split(" ");
		for(int i=0;i<words.length;i++){
		    String word=words[i];
		    String revword="";
		    for(int j=word.length()-1;j>=0;j--){
		        revword=revword+word.charAt(j);
		    }
		    revstr=revstr+revword+" ";
		}
		System.out.print(revstr);
	}
    
}
