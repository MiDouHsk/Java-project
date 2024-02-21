public class TaiKhoanNganHang {
    private double soDu;

    public void NapTien(double soTien) {
        if(soTien <= 0){
//            System.out.println("Error");
            throw new IllegalArgumentException("Error");
        }
        soDu = soDu + soTien;
    }
    public void RutTien(double soTien) {
        if(soTien > soDu) {
//            System.out.println("Error");
            throw new IllegalArgumentException("Error");
        }
        soDu = soDu - soTien;
    }
    public double getSoDu() {
        return soDu;
    }

}
