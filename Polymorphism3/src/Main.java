public class Main {
    public static void main(String[] args) {
        TaiKhoanNganHang TK1 = new TaiKhoanNganHang();

        TK1.NapTien(10000);
        TK1.RutTien(2000);
        System.out.println(TK1.getSoDu());
//        TK1.getSoDu();
    }
}