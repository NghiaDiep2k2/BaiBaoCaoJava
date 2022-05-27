package Bai3_4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BoMon> ac = new ArrayList<BoMon>();
        BoMon a = new BoMon("Toán", 2);
        BoMon b = new BoMon("Văn", 2);
        BoMon c = new BoMon("Anh", 3);
        ac.add(a);
        ac.add(b);
        ac.add(c);

        ArrayList<GiangVien> giangVien = new ArrayList<GiangVien>();
        ArrayList<GiangVien> giangVien1 = new ArrayList<GiangVien>();
        ArrayList<GiangVien> giangVien2 = new ArrayList<GiangVien>();

        GiangVien gv1 = new GiangVienThinhGiang("001", "Mai Danh Dũng", 1990, "Tiến Sĩ", 3, ac, "Phú Yên");
        GiangVien gv2 = new GiangVienThinhGiang("002", "Nguyễn Văm Binh", 1995, "Thạc Sĩ", 5, ac, "Hồ Chí Minh");
        GiangVien gv3 = new GiangVienThinhGiang("003", "Nguyễn Nhật Tân", 1992, "Thạc Sĩ", 6, ac, "Hà Nội");
        GiangVien gv4 = new GiangVienCoHuu("001", "Ngô Văn Kí", 1992, "Thạc Sĩ", 4, ac, 2.3, 2000);
        GiangVien gv5 = new GiangVienCoHuu("002", "Trần Ngọc Anh", 1990, "Tiến Sĩ", 5, ac, 2.3, 2007);
        GiangVien gv6 = new GiangVienCoHuu("003", "Lê Vũ Phước", 1990, "Giáo Sư", 10, ac, 4.0, 2005);
 
        GiangVien gv7 = new GiangVienThinhGiang("001", "Trương Ngọc Mai", 1995, "Tiến Sĩ", 4, ac, "Đà Nẵng");
        GiangVien gv8 = new GiangVienThinhGiang("002", "Nguyễn Văn Toại", 1992, "Tiến Sĩ", 3, ac, "Ninh Bình");
        GiangVien gv9 = new GiangVienThinhGiang("003", "Nguyễn Hào Duy", 1991, "Thạc Sĩ", 5, ac, "Quảng Nam");
        GiangVien gv10 = new GiangVienCoHuu("001", "Lê Thị Vân", 1996, "Tiến Sĩ", 3, ac, 2.3, 2000);
        GiangVien gv11 = new GiangVienCoHuu("002", "Nguyễn Nam Minh", 1999, "Thạc Sĩ", 6, ac, 2.3, 2007);
        GiangVien gv12 = new GiangVienCoHuu("003", "Diệp Thùy Anh", 1990, "Tiến Sĩ", 7, ac, 2.3, 2005);

        GiangVien gv13 = new GiangVienThinhGiang("001", "Đinh Thế Kiệt", 1995, "Tiến Sĩ", 4, ac, "Thái Bình");
        GiangVien gv14 = new GiangVienThinhGiang("002", "Ngô Đình Nam", 1992, "Thạc Sĩ", 3, ac, "Thanh Hóa");
        GiangVien gv15 = new GiangVienThinhGiang("003", "Lâm Quốc Khôi", 1991, "Tiến Sĩ", 5, ac, "Cà Mau");
        GiangVien gv16 = new GiangVienCoHuu("001", "Nguyễn Vân Anh", 1996, "Thạc Sĩ", 3, ac, 2.3, 2000);
        GiangVien gv17 = new GiangVienCoHuu("002", "Trần Văn Lộc", 1999, "Tiến Sĩ", 7, ac, 2.3, 2007);
        GiangVien gv18 = new GiangVienCoHuu("003", "Lâm Thùy Linh", 1990, "Tiến Sĩ", 5, ac, 2.3, 2005);

        giangVien.add(gv1);
        giangVien.add(gv2);
        giangVien.add(gv3);
        giangVien.add(gv4);
        giangVien.add(gv5);
        giangVien.add(gv6);

        giangVien1.add(gv7);
        giangVien1.add(gv8);
        giangVien1.add(gv9);
        giangVien1.add(gv10);
        giangVien1.add(gv11);
        giangVien1.add(gv12);

        giangVien2.add(gv13);
        giangVien2.add(gv14);
        giangVien2.add(gv15);
        giangVien2.add(gv16);
        giangVien2.add(gv17);
        giangVien2.add(gv18);

        MonHoc a1 = new MonHoc("CNTT", giangVien);
        MonHoc a2 = new MonHoc("KTVT", giangVien1);
        MonHoc a3 = new MonHoc("KTXD", giangVien2);

        ArrayList<MonHoc> danhSachMonHoc = new ArrayList<MonHoc>();
        danhSachMonHoc.add(a1);
        danhSachMonHoc.add(a2);
        danhSachMonHoc.add(a3);

        DanhSachMonHoc t = new DanhSachMonHoc(danhSachMonHoc, giangVien, ac);
        t.createGUI();
        for (int i = 0; i < danhSachMonHoc.size(); i++) {
            System.out.println(danhSachMonHoc.get(i).getTen());
        }

        System.out.println(giangVien.size());
    }
}