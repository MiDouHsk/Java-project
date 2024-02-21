import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int soNhanVienToanThoiGian,soNhanVienThoiVu;
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanVien;
        ArrayList<NhanVien> arrNhanVien = new ArrayList<>();

        System.out.print("Nhap so nhan vien toan thoi gian: ");
        soNhanVienToanThoiGian = scanner.nextInt();
        System.out.print("NHAP THONG TIN NHAN VIEN TOAN THOI GIAN\n");
        for(int i =0;i < soNhanVienToanThoiGian; i++) {
            System.out.println("Nhap thong tin nhan vien toan thoi gian thu "+ (i + 1) + ": ");
            nhanVien = new NhanVienToanThoiGian();
            nhanVien.nhapThongTin();
            arrNhanVien.add(nhanVien);
        }

        System.out.print("Nhap so nhan vien thoi vu:");
        soNhanVienThoiVu = scanner.nextInt();
        System.out.println("NHAP THONG TIN NHAN VIEN THOI VU");
        for( int i = 0; i < soNhanVienThoiVu; i++) {
            System.out.println("Nhap thong tin nhan vien thoi vu thu: "+ (i + 1) + ": ");
            nhanVien = new NhanVienThoiVu();
            nhanVien.nhapThongTin();
            arrNhanVien.add(nhanVien);
        }

        System.out.print("THONG TIN NHAN VIEN\n");
        for (NhanVien nv : arrNhanVien) {
            nv.tinhLuong();
            System.out.println(nv.toString());
        }
    }
}
