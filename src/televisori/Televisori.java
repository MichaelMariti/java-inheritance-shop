package televisori;

import prodotti_shop.Prodotto;

public class Televisori extends Prodotto{

    private int dimensioni;
    private boolean smart;

    public Televisori(int codiceProdotto, String nome, String marca, double prezzo, int iva, int dimensioni, boolean smart) {
        super(codiceProdotto, nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    public int getDimensioni() {
        return dimensioni;
    }

    // public void setDimensioni(int dimensioni) {
    //     this.dimensioni = dimensioni;
    // }

    public boolean isSmart() {
        return smart;
    }

    // public void setSmart(boolean smart) {
    //     this.smart = smart;
    // }

    public void stampaTelevisore() {
        System.out.println(super.toString() + "Dimensioni del televisore: " + dimensioni + "pollici, " + "È una tv smart? " + (smart ? "Smart" : "Non smart"));
    }
}
