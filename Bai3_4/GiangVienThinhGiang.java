package Bai3_4;

import java.util.List;

public class GiangVienThinhGiang extends GiangVien {
    private String NoiCongTac;

    public GiangVienThinhGiang() {
    }

    public GiangVienThinhGiang(String MaGV, String HoTen, int NamSinh,
            String TrinhDo,
            int SoNamCongTac, List<BoMon> danhSachMonHoc, String workPlace) {
        super(MaGV, HoTen, NamSinh, TrinhDo, SoNamCongTac, danhSachMonHoc);
        this.NoiCongTac = workPlace;
    }

    public String getNoiCongTac() {
        return NoiCongTac;
    }

    public void serNoiCongTac(String NoiCongTac) {
        this.NoiCongTac = NoiCongTac;
    }

    public boolean PL_50() {
        return false;
    }

    public boolean isVisitingLecturer() {
        return true;
    }

    public void display() {
        System.out
                .println(MaGV + HoTen + " " + NamSinh + " " + TrinhDo + " " + SoNamCongTac
                        + " " + NoiCongTac);
    }
}
