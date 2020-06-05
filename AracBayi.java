package AracApp;

public class AracBayi {

    public static void main(String[] args) {

        DizelMotor kamyonDizelMotor = new DizelMotor("123123");
        Arac kamyon = AracFabrikasi.createArac(kamyonDizelMotor, "Kamyon");

        BenzinliMotor arabaBenzinliMotor = new BenzinliMotor("166384", (byte) 4);
        Arac otomobil = AracFabrikasi.createArac(arabaBenzinliMotor, "Otomobil");

        BenzinliMotor motosikletBenzinliMotor = new BenzinliMotor("483082", (byte) 2);
        Arac motosiklet = AracFabrikasi.createArac(motosikletBenzinliMotor, "Motosiklet");

        BenzinliMotor scooterBenzinliMotor = new BenzinliMotor("274919", (byte) 1);
        Arac scooter = AracFabrikasi.createArac(scooterBenzinliMotor, "Scooter");

        System.out.println("Kamyon motoru üret");
        System.out.println(kamyon);
        System.out.println("---------------------");

        System.out.println("Otomobil motoru üret");
        System.out.println(otomobil);
        System.out.println("---------------------");

        System.out.println("Motosiklet motoru üret");
        System.out.println(motosiklet);
        System.out.println("---------------------");

        System.out.println("Scooter motoru üret");
        System.out.println(scooter);

    }
}
