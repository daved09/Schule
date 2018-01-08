package Girokonto;

public class KontoMain {

    String[] nummern = new String[100];
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
        nummern[0] = kaBank.getKonten()[0].getNummer();
        nummern[1] = kaBank.getKonten()[0].getNummer();
        kaBank.ueberweise(nummern[1], nummern[0], 1200);
        kaBank.print();
        kaBank.loescheKonto(nummern[1]);
    }

    public void doSomething(){
        kaBank.print();
    }

}
