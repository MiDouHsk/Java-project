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
        return "Hình chữ nhật có chiều dài = " + this.chieuDai +
                ", chiều rộng = " + this.chieuRong + ", diện tích = " + Tinhdientich();
    }
}
