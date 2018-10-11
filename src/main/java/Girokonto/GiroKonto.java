package main.java.Girokonto;


public class GiroKonto {

    private String inhaber, nummer;
    private double guthaben;

    public GiroKonto(String inhaber, String nummer, double guthaben) {
        this.inhaber = inhaber;
        this.nummer = nummer;
        this.guthaben = guthaben;
    }

    public void print(){
        String out = "Inhaber: "+inhaber+"; Kontonummer: "+nummer+"; Guthaben: "+guthaben;
        System.out.println(out);
    }


    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public double getGuthaben() {
        return guthaben;
    }

    public void setGuthaben(double guthaben) {
        this.guthaben = guthaben;
    }
}
