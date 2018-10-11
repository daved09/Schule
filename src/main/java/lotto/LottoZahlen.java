package main.java.lotto;

/**
 * @author David
 */
public class LottoZahlen {
    private int[] zahl = new int[6];
    private static final int MAX = 49;

    public LottoZahlen(){
    }

    /**
     * Nur 6 Zahlen eingeben.
     */
    public LottoZahlen(int...zahlen){
        if(zahlen.length<=6){
            for(int i=0;i<zahlen.length;i++){
                zahl[i] = zahlen[i];
            }
        }
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<zahl.length;i++){
            builder.append(zahl[i]).append(",");
        }
        builder.delete(builder.length(), builder.length());
        return builder.toString();
    }

}
