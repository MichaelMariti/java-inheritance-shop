package telefoni;

import prodotti_shop.Prodotto;

public class Smartphone extends Prodotto{
    private String IMEI;
    private int memoria; // in GB

    public Smartphone(int codiceProdotto, String nome, String marca, double prezzo, int iva, String IMEI, int memoria) {
        super(codiceProdotto, nome, marca, prezzo, iva);
        this.IMEI = IMEI;
        this.memoria = memoria;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String iMEI) {
        IMEI = iMEI;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void stampaSmartphone() {
        System.out.println(super.toString() + "Codice IMEI: " + IMEI + "Quantita di memoria: " + memoria);
    }
}
