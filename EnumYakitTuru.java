package AracApp;

public enum EnumYakitTuru {

    BENZIN("Benzinli Motor"),
    DIZEL("Dizel Motor");

    EnumYakitTuru(String turu) {
        this.turu = turu;
    }

    private final String turu;

    public String getTuru() {
        return turu;
    }

    @Override
    public String toString() {
        return this.turu;
    }
}
