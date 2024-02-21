import java.util.Scanner;
public abstract class NhanVien {
    private String tenNhanVien;
    protected long luongNhanVien;
    Scanner scanner = new Scanner(System.in);

    public NhanVien() {
        super();
    }

    public NhanVien(String tenNhanVien, long luongNhanVien) {
        super();
        this.tenNhanVien = tenNhanVien;
        this.luongNhanVien = luongNhanVien;
    }

    public void nhapThongTin() {
        System.out.print("Nhap ten nhan vien: ");
        tenNhanVien = scanner.nextLine();
    }

    public abstract void tinhLuong();

    @Override
    public String toString() {
        return "Ten nhan vien: " + this.tenNhanVien +", luong nhan vien: "
                + this.luongNhanVien + " VND";
    }
}
