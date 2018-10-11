package collections.a1;

import java.io.IOException;
import java.util.*;

public class CollectionTest {

	static StopWatch sw = new StopWatch();
	static final String FILENAME = "dictionary.txt";
	
	// HIlfsfunktion
	public static String[] loadFromFile(){
		String[] woerter = new String[80368];
		try {
			Scanner s = new Scanner(CollectionTest.class.getClassLoader().getResourceAsStream("files/"+FILENAME));
			int anzahl = 0;
			while (s.hasNext()) {
				String str =s.next();
				if(str != null)
					woerter[anzahl] = str;
				anzahl++;
			}
			s.close();
		} catch (Exception e) {
			System.err.println(e);
			System.exit(1);
		}	
		return woerter;
	}
	
	public static void testInsert(String[] src, List<String> dest){
		sw.start();
		// alle Strings aus src jeweils am Anfang in die Liste dest einfuegen
		// TODO
		sw.stop(dest.getClass().getSimpleName()+" Insert");
	}
	
	public static void testAppend(String[] src, List<String> dest){
		sw.start();
		// alle Strings aus src jeweils am Ende in die Liste dest anfuegen
		// TODO
		sw.stop(dest.getClass().getSimpleName()+" Append");
	}
	
	public static void testAccess(List<String> values){
		sw.start();
		// Alle Strings aus der Liste values nacheinander ueber den Index holen
		// (ohne Ausgabe)
		// TODO
		sw.stop(values.getClass().getSimpleName()+ " Indexzugriff");
	}
	
	public static void testSearch(List<String> values, int count, String search){
		sw.start();
		boolean found = true;
		for(int i=0; i<count; i++){
			found = found && values.contains(search);
		}
		if(!found){
			System.out.println("testSearch: nichts gefunden");
		}
		sw.stop(values.getClass().getSimpleName()+ " Search");
	}
	
	public static void testSortShuffle(List<String> values){
		sw.start();
		for(int i=0; i<10; i++){
			Collections.shuffle(values);
			Collections.sort(values);
		}
		sw.stop(values.getClass().getSimpleName()+ " Shuffle/Sort");
	}
	
	public static void testRemove(List<String> values){
		sw.start();
		// Alle Strings aus values jeweils vom Listenanfang entfernen
		// TODO
		sw.stop(values.getClass().getSimpleName()+" Remove");
	
	}
	
	public static void main(String[] args) {
		
		String[] woerter = loadFromFile();
		
		System.out.println("Collection Tests starten ...");
		
		// Legen sie je eine ArrayList und eine LinkedList an
		// TODO
		
		// Alle Strings aus woerter-Array in beide Listen einfuegen => Aufrufe testInsert
		// TODO

		// Leeren (clear) sie beide Listen ...
		// TODO
		
		// .. um wieder alle Strings aus Woerter-Array in Listen anzufuegen => Aufrufe testAppend
		// TODO

		// bei beiden Listen Zugriff über Index testen => Aufrufe testAccess
		// TODO

		// in beiden Listen 10000mal nach "murphy" suchen => Aufrufe testSearch
		// TODO

		// beide Listen sortieren und mischen => Aufrufe testSortShuffle
		// TODO
		
		// aus beiden Listen alle Elemente nach und nach entfernen => Aufrufe testRemove
		// TODO
		
		System.out.println("Collection Tests beendet");
	}

}
