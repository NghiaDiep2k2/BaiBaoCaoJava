package Bai3_4;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DanhSachMonHoc {
    private ArrayList<MonHoc> danhSachMonHoc;
    ArrayList<GiangVien> danhSachGiangVien;
    ArrayList<BoMon> danhSachMon;

    public DanhSachMonHoc() {
        danhSachMonHoc = new ArrayList<>();
        danhSachGiangVien = new ArrayList<>();
        danhSachMon = new ArrayList<>();
    }

    public DanhSachMonHoc(ArrayList<MonHoc> danhSachMonHoc, ArrayList<GiangVien> danhSachGiangVien, ArrayList<BoMon> danhSachMon) {
        this.danhSachMonHoc = danhSachMonHoc;
        this.danhSachGiangVien = danhSachGiangVien;
        this.danhSachMon = danhSachMon;
    }

    public void createGUI() {
        JFrame f;
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("DANH SÁCH GIẢNG VIÊN");

        JLabel jLabel1 = new JLabel("GIẢNG VIÊN CỐ HỮU");
        JLabel jLabel2 = new JLabel("GIẢNG VIÊN THỈNH GIẢNG");

        JScrollPane jScrollPane1 = new JScrollPane();
        String col1[] = { "MÃ GV", "HỌ TÊN", "NĂM SINH", "TRÌNH ĐỘ", "SỐ NĂM CÔNG TÁC", "HỆ SỐ LƯƠNG", "NĂM BẮT ĐẦU CÔNG TÁC",
                "DS MÔN HỌC" };
        DefaultTableModel tableMode1 = new DefaultTableModel(col1, 0);
        JTable jTable1 = new JTable(tableMode1);
        jScrollPane1.setViewportView(jTable1);

        JScrollPane jScrollPane2 = new JScrollPane();
        String col2[] = { "MÃ GV", "HỌ TÊN", "NĂM SINH", "TRÌNH ĐỘ", "SỐ NĂM CÔNG TÁC", "NƠI CÔNG TÁC",
                "DS MÔN HỌC" };
        DefaultTableModel tableMode2 = new DefaultTableModel(col2, 0);
        JTable jTable2 = new JTable(tableMode2);
        jScrollPane2.setViewportView(jTable2);

        String bs[] = new String[danhSachMonHoc.size()];
        for (int i = 0; i < danhSachMonHoc.size(); i++) {
            bs[i] = danhSachMonHoc.get(i).getTen();
        }
        ;
        JComboBox jComboBox1 = new JComboBox(bs);

        Button button1 = new Button();
        button1.setLabel("Show");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tableMode1.getDataVector().removeAllElements();
                tableMode1.fireTableDataChanged();
                tableMode2.getDataVector().removeAllElements();
                tableMode2.fireTableDataChanged();
                for (MonHoc t : danhSachMonHoc) {
                    if (jComboBox1.getSelectedItem() == t.getTen()) {
                        for (GiangVien a : t.getDanhSachGiangVien()) {
                            String magv = a.getMaGV();
                            String hoten = a.getHoTen();
                            String namsinh = String.valueOf(a.getNamSinh());
                            String trinhdo = a.getTrinhDo();
                            String sonamct = String.valueOf(a.getSoNamCongTac());
                            String dsmonhoc = "";
                            String noict = "";
                            String hesoluong = "";
                            String namCT = "";

                            // Lay ra ten mon hoc
                            for (int i = 0; i < danhSachMon.size(); i++) {
                                dsmonhoc += danhSachMon.get(i).getTenMonHoc();
                                if (i == danhSachMon.size() - 1) {
                                    break;
                                }
                                dsmonhoc += ",";
                            }
                            // Neu la Giang Vien Thinh Giang
                            if (a.isVisitingLecturer() == true) {
                                noict = ((GiangVienThinhGiang) a).getNoiCongTac();
                                String[] data = { magv, hoten, namsinh, trinhdo, sonamct, noict, dsmonhoc };
                                tableMode2.addRow(data);
                            }
                            // Neu la Giang Vien Co Huu
                            else {
                                hesoluong = String.valueOf(((GiangVienCoHuu) a).getHeSoLuong());
                                namCT = String.valueOf(((GiangVienCoHuu) a).getNamBatDauCongTac());
                                String[] data = { magv, hoten, namsinh, trinhdo, sonamct, hesoluong, namCT, dsmonhoc };
                                tableMode1.addRow(data);
                            }
                        }
                    }
                }
            }
        });

        // Can chinh layout
        GroupLayout layout = new GroupLayout(f.getContentPane());
        f.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(266, 266, 266)
                                                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 65,
                                                        GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, 0)
                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 150,
                                                        GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, 0)
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 150,
                                                        GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(204, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBox1)
                                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        f.pack();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setBounds(100, 100, (int) dim.getWidth(), (int) dim.getHeight());
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
