package arrays2;

import java.util.Scanner;

public class Arrays2 {

    public static void main(String[] args){
        Arrays2 arr = new Arrays2();
        Scanner sc = new Scanner(System.in);
        int wert, summe;
        int[] werte = new int[6];

        for(int i=0;i<werte.length;i++){
            System.out.print((i+1)+". Zahl eingeben: ");
            wert = sc.nextInt();
            werte[i] = wert;
        }
        summe = arr.getSumme(werte);
        System.out.println("Sie Summe der Werte betraegt: "+summe);
    }

    private int getSumme(int[] werte){
        int summe = 0, index = 0;
        for(int wert : werte){
            System.out.println("Index: "+index+" | Wert: "+wert);
            summe += wert;
            index++;
        }
        return summe;
    }

}
