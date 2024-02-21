public class HinhChuNhat extends Hinhhoc {
    private int chieuDai,chieuRong;
    public HinhChuNhat() {
        super();
    }
    public HinhChuNhat(int chieuDai, int chieuRong) {
        super();
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    @Override
    public double Tinhdientich() {
        return chieuDai * chieuRong;
    }
    @Override
    public String toString() {
        return "Hinh chu nhat co chieu dai la: " + this.chieuDai +
                ", chieu rong" + this.chieuRong + ", dien tich la: "+this.Tinhdientich();
    }
}
