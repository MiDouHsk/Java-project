import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static void nhapThongTinh(SinhVIenNhap tt) {
        System.out.println("Nhap ma so sinh vien: ");
        tt.setMaSV(sc.nextInt());
        ;
        sc.nextLine();
        System.out.println("Nhap ho va ten sinh vien: ");
        tt.setHoTen(sc.nextLine());
        System.out.println("Nhap dia chi sinh vien: ");
        tt.setDiaChi(sc.nextLine());
        do{
            System.out.println("Nhap so dien thoai bao gom 7 so: ");
            tt.setsTD(sc.nextLine());
        }while (tt.getsTD().length() != 7);
    }
    public static void main(String[] args) {
        SinhVIenNhap sv[] = null;
        int a, n =0;
        boolean flag = true;
        do{
            System.out.println("\nban chon lam gi?");
            System.out.println("1.Nhap thong tin sinh vien. \n" +
                    "2. xuat ban danh sanh sinh vien.\n" +
                    "Nhap so khac de thoat");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nhap so luong sinh vien can khai bao: ");
                    n = sc.nextInt();
                    sv = new SinhVIenNhap[n];
                    for ( int i = 0; i < n; i ++) {
                        System.out.println("Sinh vien thu " + (i + 1)+": ");
                        sv[i] = new SinhVIenNhap();
                        nhapThongTinh(sv[i]);
                    }
                    break;
                case 2:
                    SinhVIenNhap temp = sv[0];
                    for(int i = 0; i < sv.length - 1; i++) {
                        for(int j = i+ 1;j<sv.length;j++) {
                            if(sv[i].getMaSV() > sv[j].getMaSV()) {
                                temp = sv[j];
                                sv[j] = sv[i];
                                sv[i] = temp;
                            }
                        }
                    }
                    System.out.printf("%-5s %15s %15s %20s \n", "MSSV", "Ho va Ten", "Dia chi", "so dien thoai");
                    for (int i = 0; i< n;i++) {
                        sv[i].hienThiTT();
                    }
                    break;
                default:
                    System.out.println("Googbye");
                    flag = false;
                    break;
            }
        }while (flag);
    }
}