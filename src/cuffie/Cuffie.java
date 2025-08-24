package cuffie;

import prodotti_shop.Prodotto;

public class Cuffie extends Prodotto{
    private String colore;
    private boolean wireless;

    public Cuffie(int codiceProdotto, String nome, String marca, double prezzo, int iva) {
        super(codiceProdotto, nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    // public void setWireless(boolean wireless) {
    //     this.wireless = wireless;
    // }

    public void stampaCuffie() {
        System.out.println(super.toString() + ", Colore: " + colore + ", Modello: " + (wireless ? "Wireless" : "Cavo AUX"));
    }
}
