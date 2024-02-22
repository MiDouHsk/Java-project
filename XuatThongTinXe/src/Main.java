import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static void nhapXe(Vehicle xe) {
        System.out.print("Nhap ma xe: ");
        xe.setMaXe(sc.nextInt());sc.nextLine();
        System.out.print("Nhap ten chu xe: ");
        xe.setChuXe(sc.nextLine());
        System.out.print("Nhap dung tich xe: ");
        xe.setDungTich(sc.nextInt());
        System.out.print("Nhap tri gia xe: ");
        xe.setTriGia(sc.nextDouble());sc.nextLine();
        System.out.print("Mo ta: ");
        xe.setMoTa(sc.nextLine());
    }
    public static void main(String[] args) {
        Vehicle v[] = null;
        int a,n =0;
        boolean flag = true;
        do{
            System.out.println("ban chon lam gi!!!");
            System.out.println("1. tạo các đối tượng xe và nhập thông tin \n" +
                    "2. Xuất bản kê khai tiền thuế của các xe. \n" +
                    "Nhập số khác để thoát");
            a= sc.nextInt();
            switch (a) {
                case 1:
                    System.out.print("Nhap so luong xe ban ban muon khai bao thue: ");
                    n =sc.nextInt();
                    v = new Vehicle[n];
                    for(int i = 0; i < n;i++) {
                        System.out.println("Xe thu "+ (i+1));
                        v[i] = new Vehicle();
                        nhapXe(v[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%5s %5s %5s %10s %10s %8s \n", "Mã xe", "Chủ xe", "dung tích", "trị giá", "Mô tả", "Thuế");
                    for(int i = 0; i < n; i++) {
                        v[i].inThue();
                    }
                    break;
                default:
                    System.out.println("Bye");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}