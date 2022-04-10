import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HashAndTreeSetTester {

	public static void main(String[] args) 
		      throws FileNotFoundException
		   {
				System.out.println("Starting Read HashSet Test for TreeSet"); 
				long hashSetTime;  
				StopWatch timer = new StopWatch();
				timer.start();
				Set<String>  words = readWords("./resources/war-and-peace.txt");
				timer.stop();
				hashSetTime = timer.getElapsedTime();
				timer.reset();
				System.out.println("Elapsed time for hashset "
				+ hashSetTime + " milliseconds.  Number of words: " + words.size());
				
				
				
		   }
	

	
	public static ArrayList<String> readWordsArrayList(String fileName) throws FileNotFoundException 
	{
	    Scanner s = new Scanner(new File(fileName));
	    ArrayList<String> list = new ArrayList<String>();
	    while (s.hasNext()){
	        list.add(s.next());
	    }
	    s.close();
	    return list;
	}

	public static TreeSet<String> readWordsTreeSet(String fileName) throws FileNotFoundException 
	{
	    Scanner s = new Scanner(new File(fileName));
	    TreeSet<String> list = new TreeSet<String>();
	    while (s.hasNext()){
	        list.add(s.next());
	    }
	    s.close();
	    return list;
	}	
	public static Set<String> readWords(String filename) throws FileNotFoundException
	{
	      Set<String> words = new HashSet<>();
	      Scanner in = new Scanner(new File(filename));
	      // Use any characters other than a-z or A-Z as delimiters
	      in.useDelimiter("[^a-zA-Z]+");
	      while (in.hasNext())
	      {
	         words.add(in.next().toLowerCase());        
	      }
	      return words;
	   }
	
	
 
}
