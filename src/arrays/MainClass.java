package arrays;

public class MainClass {
	
	public static void main(String[] args){
		FachKlasse fach = new FachKlasse(10);
		int ptr = 0;
		while(!fach.isFull()){
			int tmp = ptr+1;
			System.out.print("Zahl "+tmp+" von "+fach.size()+" eingeben: ");
			fach.scan(ptr);
			ptr++;
		}
		fach.sortieren();
		fach.print();
	}
	
	
	
}
