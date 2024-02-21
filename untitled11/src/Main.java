import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choose, chieuDai, chieuRong, banKinh;
        Scanner scanner = new Scanner (System.in);
        Random random;
        Hinhhoc hinhhoc;
        DanhSachHinh danhSachHinh = new DanhSachHinh();

        System.out.println("1. Them hinh chu nhat");
        System.out.println("2. them hinh tron");
        System.out.println("3. hien thi danh sach hinh tron");
        System.out.println("4. dem so luong hinh chu nhat");
        System.out.println("5. hien thi thong tin hinh chu nhat co dien tich  lon");
        System.out.println("6. thoat chuong trinh");

        do {
            System.out.print("Chon chuc nang tu 1 -> 6: ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    random = new Random();
                    do{
                        chieuDai = random.nextInt(5) + 1;
                        chieuRong = random.nextInt(5) + 1;
                    }while (chieuDai <= chieuRong);
                    hinhhoc = new HinhChuNhat(chieuDai, chieuRong);
                    danhSachHinh.themHinh(hinhhoc);
                    System.out.println("them thanh cong hinh chu nhat" + chieuDai + "&" + chieuRong);
                    break;
                case 2:
                    random = new Random();
                    banKinh = random.nextInt(5) + 1;
                    hinhhoc = new HinhTron(banKinh);
                    danhSachHinh.themHinh(hinhhoc);
                    System.out.print("them thanh cong hinh tron co ban kinh = "+ banKinh + "\n");
                    break;

                case 3:
                    System.out.print("Thong tin cac hinh co trong danh sach: ");
                    danhSachHinh.hienThiDanhSachHinh();
                    break;
                case 4:
                    System.out.print("So luong hinh chu nhat = " +
                            danhSachHinh.demSoHinhChuNhat());
                    break;
                case 5:
                    System.out.print("Thong tin hinh chu nhat co dien tich lon nhat: ");
                    danhSachHinh.hienThiHinhChuNhatCoDienTichLonNhat();
                    break;
                case 6:
                    System.out.print("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("chuc nang chon phai nam trong khoang tu 1 -> 6");
                    break;
            }
        }while (true);
    }
}