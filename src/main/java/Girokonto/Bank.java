package main.java.Girokonto;

import org.jetbrains.annotations.NotNull;

public class Bank {

    private String name, bankleitzahl;
    private GiroKonto[] konten = new GiroKonto[1000];

    public Bank(String name, String bankleitzahl, GiroKonto[] konten) {
        this.name = name;
        this.bankleitzahl = bankleitzahl;
        this.konten = konten;
    }

    public Bank(String name, String bankleitzahl) {
        this(name, bankleitzahl, new GiroKonto[1000]);
    }


    public String neuesKonto(String inhaber, double guthaben){
        for(int i=0; 0<konten.length;i++){
            if(konten[i] == null){
                konten[i] = new GiroKonto(inhaber, generateNummer(), guthaben);
                return konten[i].getNummer();
            }
        }
        return null;
    }

    @NotNull
    private String generateNummer(){
        final int min = 111111;
        int nummer = 0;
        while (nummer < min)
        {
            nummer = (int)(Math.random()*1000000);
        }
        return Integer.toString(nummer);
    }

    public void loescheKonto(String nummer){
        for(int i=0;i<konten.length;i++){
            if(konten[i] != null){
                if(konten[i].getNummer().equals(nummer)){
                    konten[i] = null;
                    return;
                }
            }
        }
    }

    public GiroKonto getKontoByNummer(String nummer){
        for(GiroKonto konto : konten){
            if(konto.getNummer().equals(nummer)){
                return konto;
            }
        }
        return null;
    }

    public void print(){
        for(GiroKonto konto : konten){
            if(konto != null){
                konto.print();
            }
        }
        for(int i=0;i<100;i++){
            System.out.print("-");
        }
        System.out.println();
    }

    public boolean ueberweise(String quellNummer, String zielNummer, double betrag){
        GiroKonto  kontoQuelle = getKontoByNummer(quellNummer), kontoZiel = getKontoByNummer(zielNummer);
        if ((kontoQuelle != null) && (kontoZiel != null)) {
            kontoQuelle.setGuthaben(kontoQuelle.getGuthaben() - betrag);
            kontoZiel.setGuthaben(kontoZiel.getGuthaben() + betrag);
            return true;
        }
        return false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankleitzahl() {
        return bankleitzahl;
    }

    public void setBankleitzahl(String bankleitzahl) {
        this.bankleitzahl = bankleitzahl;
    }

    public GiroKonto[] getKonten() {
        return konten;
    }

    public void setKonten(GiroKonto[] konten) {
        this.konten = konten;
    }
}
