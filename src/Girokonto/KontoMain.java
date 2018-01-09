package Girokonto;

import java.util.ArrayList;
import java.util.List;

public class KontoMain {

    List<String> nummern = new ArrayList<String>();
    Bank kaBank;

    public static void main(String[] args){
        KontoMain main = new KontoMain();
        main.createKABank();
        main.doSomething();
    }

    public void createKABank(){
        kaBank = new Bank("Karlsruher Bank", "12345678");
        kaBank.neuesKonto("David Bannasch", 0.00);
        kaBank.neuesKonto("Deine Mudda", 3000);
        nummern.add(kaBank.getKonten()[0].getNummer());
        nummern.add(kaBank.getKonten()[0].getNummer());
        kaBank.ueberweise(nummern.get(1), nummern.get(0), 1200);
        kaBank.print();
        kaBank.loescheKonto(nummern.get(0));
    }

    public void doSomething(){
        kaBank.print();
    }

}
