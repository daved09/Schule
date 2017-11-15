package aufgabe1;

import java.util.Scanner;

public class Scheresteinpapier{

    @SuppressWarnings("resource")
	public static void main(String[] args){
        Funktionen fun = new Funktionen();
        Scanner sc = new Scanner(System.in);
        char eingabe;
        while((fun.punkteSpieler < 3)&&(fun.punkteComputer < 3)){
            fun.generate();
            printUI(fun);
            eingabe = sc.nextLine().charAt(0);
            fun.pruefe(eingabe);
        }
    }

    private static void printUI(Funktionen fun){
        System.out.println("x = Schere, s = stein, p = papier");
        System.out.println("Punkte: Computer : "+fun.punkteComputer+" | Spieler : "+fun.punkteSpieler);
        System.out.print("Eingabe: ");
    }

}
