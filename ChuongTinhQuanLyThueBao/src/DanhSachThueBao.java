import java.util.ArrayList;

public class DanhSachThueBao {
    ArrayList<ThueBao> arrThueBao = new ArrayList<>();
    long tongCuocThueBaoDiaIUp = 0, tongCuocThueBaoADSL = 0, tongCuocThueBaoT1 = 0;

    public DanhSachThueBao() {
        super();
    }

    public void themThueBao(ThueBao thueBao) {
        arrThueBao.add(thueBao);
    }

    public void hienThiDanhSachThueBao() {
        for(int i = 0; i < arrThueBao.size(); i++) {
            System.out.println(arrThueBao.get(i).toString());
        }
    }
    public void tinhTongCuocCuaTungLoaiThueBao() {

        for( ThueBao thueBao : arrThueBao) {
            if (thueBao instanceof ThueBaoDiaIUp) {
                tongCuocThueBaoDiaIUp += thueBao.tinhTien();
            } else if (thueBao instanceof ThueBaoADSL) {
                tongCuocThueBaoADSL += thueBao.tinhTien();
            } else {
                tongCuocThueBaoT1 += thueBao.tinhTien();
            }
        }
        System.out.println("Tổng cước thuê bao DiaI Up = " + tongCuocThueBaoDiaIUp);
        System.out.println("Tổng cước thuê bao ADSL = " + tongCuocThueBaoADSL);
        System.out.println("Tổng cước thuê bao T1 = " + tongCuocThueBaoT1);
    }
    public void TinhTongCUocCuaTatCaCacThueBao() {
        long tongCuocThueBao = tongCuocThueBaoDiaIUp +tongCuocThueBaoADSL+tongCuocThueBaoT1;
        System.out.println("Tổng cước của tất cả các thuê bao trong tháng = " + tongCuocThueBao);
    }

    public void hienThiThueBaoCoTIenCuocLonNhat() {
        long temp = 0;
        ThueBaoADSL thueBaoADSL = new ThueBaoADSL();
        for (ThueBao thueBao : arrThueBao) {
            if (thueBao instanceof ThueBaoADSL) {
                if( temp < thueBao.tinhTien()) {
                    temp = thueBao.tinhTien();
                    thueBaoADSL = (ThueBaoADSL) thueBao;
                }
            }
        }
        System.out.println("Thuê bao ADSL có tiền cước lớn nhất là: "+ thueBaoADSL.toString());
    }
}
