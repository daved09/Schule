package Girokonto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class KontoMain {

    private List<String> nummern = new ArrayList<String>();
    private Bank kaBank;

    public static void main(String[] args){
        KontoMain main = new KontoMain();
        main.createKABank();
        main.doSomething();
    }

    private void createKABank(){
        kaBank = new Bank("Karlsruher Bank", "12345678");
        kaBank.neuesKonto(input("Name eingeben: "), 0.00);
        kaBank.neuesKonto(input("Name eingeben: "), 3000);
        out.println();
        nummern.add(kaBank.getKonten()[0].getNummer());
        nummern.add(kaBank.getKonten()[1].getNummer());
        kaBank.ueberweise(nummern.get(1), nummern.get(0), 1200);
        kaBank.print();
        kaBank.loescheKonto(nummern.get(0));
    }

    private String input(String text){
        Scanner sc = new Scanner(System.in);
        out.print(text);
        String in = sc.nextLine();
        return in;
    }

    private void doSomething(){
        kaBank.print();
    }

}
