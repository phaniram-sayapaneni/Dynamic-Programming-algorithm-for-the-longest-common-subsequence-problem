
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class LCS_phaniram_sayapaneni_phaniram {

	public LCS_phaniram_sayapaneni_phaniram() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new File("input.txt"));
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		System.out.println(line1);
		System.out.println(line2);
		char a;char b;
		///////////algorithm starts from here
		int opt[][] = new int[line1.length()+1][line2.length()+1]; int pi[][] = new int[line1.length()+1][line2.length()+1];
		for (int k =0; k< line2.length(); k++)
			{opt[0][k] = 0;}
		for (int i =1; i<=line1.length(); i++)
			{opt[i][0] = 0;
		    for (int j=1; j<=line2.length(); j++ )
		    	 {a =line1.charAt(i-1); b= line2.charAt(j-1); 
		    	 if(a==b)
		    	 {opt[i][j]=opt[i-1][j-1] +1;pi[i][j] = 2; }
		    	 else if(opt[i][j-1]>= opt[i-1][j])
		    	 {opt[i][j] = opt[i][j-1];pi[i][j] = 1;}
		    	 else
		    	 {opt[i][j] = opt[i-1][j];pi[i][j] = 3;}
		    	 }
			}
		{System.out.println(opt[line1.length()][line2.length()]);}	
		int i = line1.length()-1; int j = line2.length()-1;String s= "";
		while(i>=0 && j>=0)
		{if (pi[i+1][j+1] == 2)
		    {s= line1.charAt(i) +s; i= i-1; j = j-1; }
		else if(pi[i+1][j+1] == 3)
		    {i = i-1;}
		else
		    {j = j-1;}	
		}
		{System.out.println(s);}
		 PrintWriter printWriter = new PrintWriter ("output.txt");
	        printWriter.println (opt[line1.length()][line2.length()]);
	        printWriter.println (s);
	        printWriter.close ();
		
	}

}
