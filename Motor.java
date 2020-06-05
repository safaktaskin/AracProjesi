package AracApp;

public class Motor {

    private String motorNo;
    private byte zaman;
    private EnumYakitTuru yakitTuru;

    public Motor(String motorNo, byte zaman, EnumYakitTuru yakitTuru) {
        this.motorNo = motorNo;
        this.zaman = zaman;
        this.yakitTuru = yakitTuru;
    }

    public String getMotorNo() {
        return motorNo;
    }

    public void setMotorNo(String motorNo) {
        this.motorNo = motorNo;
    }

    public byte getZaman() {
        return zaman;
    }

    public void setZaman(byte zaman) {
        this.zaman = zaman;
    }

    @Override
    public String toString() {
        return " motorNo='" + motorNo + '\'' +
                ", zaman=" + zaman +
                ", yakitTuru=" + yakitTuru;
    }
}
