public class Main {
    public static void main(String[] args) {
        System.out.println("Main started");

        Vlakno vlakno = new Vlakno("Mima", 1);
        vlakno.startXXX();
        Vlakno vlakno1 = new Vlakno("Klaudi", 2);
        vlakno1.startXXX();
        Vlakno vlakno2 = new Vlakno("Tomas", 3);
        vlakno2.startXXX();

        System.out.println("Main finished");
    }
}
