import java.text.DecimalFormat;
public class HinhTron extends Hinhhoc{
    private int banKinh;
    DecimalFormat dcf = new DecimalFormat("#.##");

    public HinhTron() {
        super();
    }
    public HinhTron (int banKinh) {
        super();
        this.banKinh = banKinh;
    }
    @Override
    public double Tinhdientich() {
        return 3.14 * banKinh * banKinh;
    }
    @Override
    public String toString() {
        return "Hinh tron co ban kinh = " + this.banKinh +
                ", dien tich = " + dcf.format(Tinhdientich());
    }

}
