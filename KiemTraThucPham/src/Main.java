import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThucPham tp = new ThucPham();
        boolean kt = true;
        boolean th = true;
        System.out.println("Nhập mã hàng: ");
        tp.setMaHang(scanner.nextInt());
        scanner.nextLine();
        do{
            System.out.print("Nhập tên hàng: ");
            tp.setTenHang(scanner.nextLine());
        }while (tp.kiemTraTenHang(kt));
        System.out.println("Nhập đơn giá: ");
        tp.setDonGia(scanner.nextDouble());
        do{
            System.out.println("Nhập năm, tháng, ngày sản xuất (yyyy mm dd): ");
            tp.setNSX(scanner.nextInt(),scanner.nextInt(), scanner.nextInt());
            System.out.println("Nhập năm, tháng, ngày hết hạn (yyyy mm dd):  ");
            tp.setHSD(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        } while (tp.kiemTraNgay(th));
        System.out.println(tp);
        tp.kiemTraHSD();
    }
}