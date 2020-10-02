package letturafilesortedset;

import java.io.*;
import java.util.*;

public class LetturaFileSortedSet {

public static void main(String[] args) throws FileNotFoundException, IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Cagnato\\eclipse-workspace\\LetturaFileSortedSet\\src\\main\\java\\letturafilesortedset\\dizionario.txt"));
		String line = reader.readLine();
		Map <String, String> mappa = new HashMap<>();
		TreeSet<String> dizionario = new TreeSet<String>();
		
		while(line != null){
			int i = 0;
		    while(line.charAt(i) != ':'){
		     
			     i++;
		    }
		
		    String valore = line.substring(i+2);
		    String chiave = line.substring(0,i);
		    mappa.put(chiave, valore);
		    dizionario.add(chiave);
		    line = reader.readLine();
		    
		}
		
		
			
			System.out.println(dizionario.first());
		
			
			
		long a = System.currentTimeMillis();
		for(int i = 0 ; i<1000000; i++){
		    boolean b = findTest("Cavia Peruviana", dizionario);
		}
		a = System.currentTimeMillis() - a;
		System.out.println("tempo di esecuzione della findTest (sorted set): " + a);
	}
	
	
	
	public static boolean findTest(String chiave, Set<String> dizionario){
		
		boolean b = false;
		for(String s : dizionario){
			if( s.equals(chiave)) {
				b = true;
				break;
			}
		}
		return b;
		
	}
}
