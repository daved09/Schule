package Girokonto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class KontoMain {

    private List<String> nummern = new ArrayList<>();
    private Bank kaBank;

    public static void main(String[] args){
        try{
            KontoMain main = new KontoMain();
            main.createKABank();
            main.doSomething();
        }
        catch (Exception e){
            main(args);
        }
    }

    private void createKABank(){
        kaBank = new Bank("Karlsruher Bank", "12345678");
        nummern.add(kaBank.neuesKonto("David Bannasch", 0.00));
        nummern.add(kaBank.neuesKonto("Deine Mudda", 3000));
        nummern.add(kaBank.neuesKonto("Markus Liebel", 0.00));
        out.println();
        kaBank.ueberweise(nummern.get(1), nummern.get(0), 1200);
        kaBank.print();
        kaBank.loescheKonto(nummern.get(0));
    }

    private void doSomething(){
        kaBank.print();
    }

}
