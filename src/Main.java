import cuffie.Cuffie;
import telefoni.Smartphone;
import televisori.Televisori;

public class Main {
    public static void main(String[] args) throws Exception {
        // Prodotto p1 = new Prodotto(1564, "Iphone", "Apple", 997, 22);

        // Nuovo prodotto Smartphone
        Smartphone s1 = new Smartphone(5486, "Iphone", "Apple", 997, 22, "ABCD4586", 500);
        System.out.println(s1);
        System.out.println("Prezzo con iva: Euro" + s1.getPrezzoConIva());
        System.out.println();
        // System.out.println(s1);


        // Creiamo un nuovo Televisore
        Televisori t1 = new Televisori(987, "QLED TV", "Samsung", 1250, 22, 50, true);
        System.out.println(t1);
        System.out.println("Prezzo con iva: Euro" + t1.getPrezzoConIva());
        System.out.println();


        // Nuovo prodotto cuffie
        Cuffie c1 = new Cuffie(555, "BOSE", "JBL", 59.99, 22);
        System.out.println(c1);
        System.out.println("Prezzo con iva: Euro" + c1.getPrezzoConIva());
        System.out.println();

        
    }
}
