package lotto;

public class LottoSchein {

    private int scheinNummer;

    public LottoSchein(){
        genScheinNummer();
    }

    private void genScheinNummer(){
        int rand;
        rand = (int) (Math.random()*10000000);
        scheinNummer = rand;
    }

    public int getScheinNummer() {
        return scheinNummer;
    }
}
