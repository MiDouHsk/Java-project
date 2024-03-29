 class NhanVienToanThoiGian extends NhanVien{
    private int soNgayLamThem, choose;
    private String loaiNhanVien;
    private static long LUONG_NHAN_VIEN_LA_SEP = 15000000;
    private static long LUONG_NHAN_VIEN_BINH_THUONG = 6000000;
    private static long LUONG_LAM_THEM = 800000;

    public NhanVienToanThoiGian() {
        super();
    }

    public NhanVienToanThoiGian(int soNgayLamThem, String loaiNhanVien) {
        super();
        this.soNgayLamThem = soNgayLamThem;
        this.loaiNhanVien = loaiNhanVien;
    }

    public int getSoNgayLamThem() {
        return soNgayLamThem;
    }

    public void setSoNgayLamThem(int soNgayLamThem) {
        this.soNgayLamThem = soNgayLamThem;
    }

    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap So ngay lam them: ");
        soNgayLamThem = scanner.nextInt();
        System.out.print("Nhap loai nhan vien (1- binh thuong; 2- sep): ");
        choose = scanner.nextInt();
        switch (choose) {
            case 1:
                loaiNhanVien = "Nhan vien binh thuong";
                break;
            case 2:
                loaiNhanVien = "Sep";
                break;
            default:
                System.out.print("Nhap loai nhan vien khong dung!\n");
                break;
        }
    }
    @Override
    public void tinhLuong() {
        if( loaiNhanVien.equals("Nhan vien binh thuong")) {
            luongNhanVien = LUONG_NHAN_VIEN_BINH_THUONG + this.soNgayLamThem * LUONG_LAM_THEM;
        } else if (loaiNhanVien.equals("Sep")) {
            luongNhanVien = LUONG_NHAN_VIEN_LA_SEP + this.soNgayLamThem * LUONG_LAM_THEM;
        }
    }

    @Override
    public String toString() {
        return super.toString() +", loai nhan vien: "+this.loaiNhanVien +
                ", so ngay lam them: " + this.soNgayLamThem;
    }
}
