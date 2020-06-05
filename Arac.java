package AracApp;

public abstract class Arac {

    private long silindirSayisi;
    private Motor motor;

    public Arac(Motor motor, long silindirSayisi) {
        this.motor = motor;
        this.silindirSayisi = silindirSayisi;
    }

    public Arac() {
    }

    public long getSilindirSayisi() {
        return silindirSayisi;
    }

    public void setSilindirSayisi(long silindirSayisi) {
        this.silindirSayisi = silindirSayisi;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "silindirSayisi=" + silindirSayisi +
                ", motor=" + motor +
                '}';
    }
}