package AracApp;

public class Otomobil extends Arac {

    private YagPompasi yagPompasi;

    public Otomobil(Motor motor, long silindirSayisi, YagPompasi yagPompasi) {
        super(motor, silindirSayisi);
        this.yagPompasi = yagPompasi;
    }
}