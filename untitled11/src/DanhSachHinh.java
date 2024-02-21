import java.util.ArrayList;

public class DanhSachHinh {
    ArrayList<Hinhhoc> arrHinhHoc;

    public DanhSachHinh() {
        super();
        arrHinhHoc = new ArrayList<>();
        arrHinhHoc.add(new HinhChuNhat(7,3));
        arrHinhHoc.add(new HinhTron(3));
        arrHinhHoc.add(new HinhChuNhat(10,1));
    }
    public void themHinh(Hinhhoc hinhhoc) {
        arrHinhHoc.add(hinhhoc);
    }

    public void hienThiDanhSachHinh() {
        for (int i = 0; i < arrHinhHoc.size(); i++) {
            System.out.println(arrHinhHoc.get(i).toString());
        }
    }

    public int demSoHinhChuNhat() {
        int soHinhChuNhat = 0;
        for( Hinhhoc hinhhoc : arrHinhHoc) {
            if (hinhhoc instanceof HinhChuNhat) {
                soHinhChuNhat++;
            }
        }
        return soHinhChuNhat;
    }
    public void hienThiHinhChuNhatCoDienTichLonNhat() {
        double temp = 0;
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        for (Hinhhoc hinhHoc : arrHinhHoc) {
            if (hinhHoc instanceof HinhChuNhat) {
                if (temp < hinhHoc.Tinhdientich()) {
                    temp = hinhHoc.Tinhdientich();
                    hinhChuNhat = (HinhChuNhat) hinhHoc;
                }
            }
        }
        System.out.println("Hình chữ nhật có diện tích lớn nhất là " + hinhChuNhat.toString());
    }
}
