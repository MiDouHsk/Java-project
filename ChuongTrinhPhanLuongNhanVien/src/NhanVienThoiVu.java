public class NhanVienThoiVu extends NhanVien{
    private int gioLamViec;
    private static long LUONG_NHAN_VIEN_THOI_VU_MOT_GIO = 100000;

    public NhanVienThoiVu() {
        super();
    }

    public NhanVienThoiVu(int gioLamViec) {
        super();
        this.gioLamViec = gioLamViec;
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap so gio lam viec: ");
        gioLamViec = scanner.nextInt();
    }

    @Override
    public void tinhLuong() {
        luongNhanVien = LUONG_NHAN_VIEN_THOI_VU_MOT_GIO * this.gioLamViec;
    }

    @Override
    public String toString() {
        return super.toString() + ", Gio lam viec: "+this.gioLamViec;
    }
}
