package AracApp;

public class AracFabrikasi {

    public static Arac createArac(Motor motor, String tasitTuru) {
        Arac arac;
        if("Kamyon".equalsIgnoreCase(tasitTuru)){
            YagPompasi yagPompasi = new YagPompasi();
            yagPompasi.setKimlikNo("453234");
            yagPompasi.setYagPompasiKapasite(EnumYagPompasiKapasite.BES);
            arac = new Kamyon((DizelMotor) motor, yagPompasi);
        } else if("Otomobil".equalsIgnoreCase(tasitTuru)){
            YagPompasi yagPompasi1 = new YagPompasi();
            yagPompasi1.setKimlikNo("453534");
            yagPompasi1.setYagPompasiKapasite(EnumYagPompasiKapasite.BIR);
            arac = new Otomobil(motor, 4, yagPompasi1);
        } else if("Scooter".equalsIgnoreCase(tasitTuru)){
            arac = new Scooter(motor);
        } else if("Motosiklet".equalsIgnoreCase(tasitTuru)){
            arac = new Motosiklet((BenzinliMotor) motor, 2);
        } else {
            throw new RuntimeException("Bu tip araçlara motor üretimi yoktur.");
        }

        return arac;
    }
}
