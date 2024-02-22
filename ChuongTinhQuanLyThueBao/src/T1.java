public class T1 extends ThueBao{
    private static int THUE_BAO_HANG_THANG = 2000000;
    public T1() {
        super();
    }

    public long tinhTien() {
        return THUE_BAO_HANG_THANG;
    }

    @Override
    public String toString() {
        return "Thuê bao T1 có thuê bao hàng tháng = " + this.THUE_BAO_HANG_THANG +
                ", tổng tiền = " + tinhTien();
    }
}
