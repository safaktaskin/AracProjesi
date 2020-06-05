package AracApp;

public class BenzinliMotor extends Motor {

    private EnumBujiSiraNo bujiSiraNo;

    public BenzinliMotor(String motorNo, byte zaman) {
        super(motorNo, zaman, EnumYakitTuru.BENZIN);
    }

    public EnumBujiSiraNo getBujiSiraNo() {
        return bujiSiraNo;
    }

    public void setBujiSiraNo(EnumBujiSiraNo bujiSiraNo) {
        this.bujiSiraNo = bujiSiraNo;
    }
}