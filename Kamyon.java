package AracApp;

public class Kamyon extends Arac {

    private YagPompasi yagPompasi;

    public Kamyon(DizelMotor dizelMotor, YagPompasi yagPompasi) {
        super(dizelMotor, 12);
        this.yagPompasi = yagPompasi;
    }
}