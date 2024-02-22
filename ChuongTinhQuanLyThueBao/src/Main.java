import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choose, soPhutTruyCap,soMBTruyCap;
        Scanner scanner = new Scanner(System.in);
        ThueBao thueBao;
        DanhSachThueBao danhSachThueBao = new DanhSachThueBao();

        System.out.println("1. Thêm Thuê Bao DiaI Up");
        System.out.println("2. Thêm Thuê Bao ADSL");
        System.out.println("3. Thêm Thuê Bao T1");
        System.out.println("4. hiển thị danh sách thuê bao");
        System.out.println("5. tính tổng tiền cước của từng loại thuê bao");
        System.out.println("6. Tính tính tổng tiền cước của tất cả cá loại thuê bao");
        System.out.println("7. hiển thị thông tin thuê bao ADSL có tiền cước lớn nhất");
        System.out.println("8. thoát");

        do{
            System.out.print("chon chuc nang ( tu 1 den 8): ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.print("Nhap so phut truy cap");
                    soPhutTruyCap = scanner.nextInt();
                    thueBao = new ThueBaoDiaIUp(soPhutTruyCap);
                    danhSachThueBao.themThueBao(thueBao);
                    System.out.println("thêm thanh công thuê bao DiaI up có số phút truy cập =" +
                            soPhutTruyCap);
                    break;
                case 2:
                    System.out.print("Nhap so MB truy cap");
                    soMBTruyCap = scanner.nextInt();
                    thueBao = new ThueBaoADSL(soMBTruyCap);
                    danhSachThueBao.themThueBao(thueBao);
                    System.out.println("Them thanh cong thue bao ADSL co so MB truy cap  = " +
                            soMBTruyCap);
                case 3:
                    thueBao = new T1();
                    danhSachThueBao.themThueBao(thueBao);
                    System.out.println("them thanh cong thue bao T1");
                    break;
                case 4:
                    System.out.println("thong tin cac thue bao co trong danh sach thue bao: ");
                    danhSachThueBao.hienThiDanhSachThueBao();
                    break;
                case 5:
                    danhSachThueBao.tinhTongCuocCuaTungLoaiThueBao();
                    break;
                case 6:
                    danhSachThueBao.TinhTongCUocCuaTatCaCacThueBao();
                    break;
                case 7:
                    danhSachThueBao.hienThiThueBaoCoTIenCuocLonNhat();
                    break;
                case 8:
                    System.out.println("Thoat Chuong Trinh");
                    System.exit(0);
                    break;
                default:
                    System.out.println("chuc nang lua chon phai nam trong khoan tu 1 den 8 ");
                    break;
            }
        }while (true);
    }
}