package klassenarbeit;

import java.util.Scanner;

public class Kugel {
	
	Scanner sc = new Scanner(System.in);
	
	String[] menu = { "1 = Volumen", "2 = Oberfläche", "3 = Beenden" };
	
	public static void main(String[] args){
		Kugel kugel = new Kugel();
		kugel.start();
	}
	
	private void start(){
		System.out.println("Kugel\nAuswahlmenu");
		for(String var : menu)
			System.out.println(var);
		int auswahl;
		while(true){
			System.out.print("Auswahl: ");
			auswahl = sc.nextInt();
			switch(auswahl){
			case 1:berechneVolumen();break;
			case 2:berechneOberflaeche();break;
			case 3:return;
			default:System.err.println("Eintrag nicht gefunden.");break;
			}
		}
	}
	
	private void berechneVolumen(){
		int radius;
		System.out.print("Radius eingeben: ");
		radius = sc.nextInt();
		System.out.println("Das Volumen betraegt: "+(4/3)*Math.PI*Math.pow(radius, 3));
	}
	
	private void berechneOberflaeche(){
		int radius;
		System.out.print("Radius eingeben: ");
		radius = sc.nextInt();
		System.out.println("Die Oberflaeche betraegt: "+4*Math.PI*Math.pow(radius, 2));
	}
	
}
