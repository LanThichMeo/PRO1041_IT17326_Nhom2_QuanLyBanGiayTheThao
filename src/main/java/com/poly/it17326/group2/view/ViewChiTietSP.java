package com.poly.it17326.group2.view;

import com.poly.it17326.group2.domainmodel.ChiTietSP;
import com.poly.it17326.group2.domainmodel.DeGiay;
import com.poly.it17326.group2.domainmodel.MauSac;
import com.poly.it17326.group2.domainmodel.NhaCungCap;
import com.poly.it17326.group2.domainmodel.SanPham;
import com.poly.it17326.group2.domainmodel.Size;
import com.poly.it17326.group2.domainmodel.ThuongHieu;
import com.poly.it17326.group2.response.ViewChiTietSPResponse;
import com.poly.it17326.group2.response.ViewDeGiayResponse;
import com.poly.it17326.group2.response.ViewMauSacReponse;
import com.poly.it17326.group2.response.ViewNhaCungCapResponse;
import com.poly.it17326.group2.response.ViewSanPhamResponse;
import com.poly.it17326.group2.response.ViewSizeReponse;
import com.poly.it17326.group2.response.ViewThuongHieuReposponse;
import com.poly.it17326.group2.service.BanHangService;
import com.poly.it17326.group2.service.ChiTietSPService;
import com.poly.it17326.group2.service.ICommon;
import com.poly.it17326.group2.service.impl.BanHangServiceImpl;
import com.poly.it17326.group2.service.impl.ChiTietSPServiceImpl;
import com.poly.it17326.group2.service.impl.SanPhamServiceImpl;
import com.poly.it17326.group2.service.impl.SizeServiceImpl;
import com.poly.it17326.group2.service.impl.ViewDeGiayServiceImpl;
import com.poly.it17326.group2.service.impl.ViewMauSacServiceImpl;
import com.poly.it17326.group2.service.impl.ViewNhaCungCapServiceImpl;
import com.poly.it17326.group2.service.impl.ViewThuongHieuServiceImpl;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewChiTietSP extends javax.swing.JFrame {

    private DefaultComboBoxModel dcbm;

    private DefaultTableModel dtm;

    private ChiTietSPService chiTietSPService = new ChiTietSPServiceImpl();

    private ICommon<ViewSizeReponse, Size> sizeService = new SizeServiceImpl();

    private ICommon<ViewNhaCungCapResponse, NhaCungCap> nccService = new ViewNhaCungCapServiceImpl();

    private ICommon<ViewDeGiayResponse, DeGiay> deGiayService = new ViewDeGiayServiceImpl();

    private ICommon<ViewThuongHieuReposponse, ThuongHieu> thuongHieuService = new ViewThuongHieuServiceImpl();

    private ICommon<ViewMauSacReponse, MauSac> mauSacService = new ViewMauSacServiceImpl();

    private ICommon<ViewSanPhamResponse, SanPham> sanPhamService = new SanPhamServiceImpl();

    private BanHangService banHangService = new BanHangServiceImpl();

    public ViewChiTietSP() {
        initComponents();
        setLocationRelativeTo(null);
        loadNCC(nccService.getAll());
        loadSize(sizeService.getAll());
        loadDeGiay(deGiayService.getAll());
        loadThuongHieu(thuongHieuService.getAll());
        loadMau(mauSacService.getAll());
        loadSanPham(sanPhamService.getAll());
    }

    private void loadNCC(List<ViewNhaCungCapResponse> listNCC) {
        dcbm = (DefaultComboBoxModel) cbbNCC.getModel();
        for (ViewNhaCungCapResponse viewNhaCungCapResponse : listNCC) {
            dcbm.addElement(viewNhaCungCapResponse.getMa());
        }
    }

    private void loadSize(List<ViewSizeReponse> listSize) {
        dcbm = (DefaultComboBoxModel) cbbSize.getModel();
        for (ViewSizeReponse viewSizeReponse : listSize) {
            dcbm.addElement(viewSizeReponse.getTen());
        }
    }

    private void loadDeGiay(List<ViewDeGiayResponse> listDeGiay) {
        dcbm = (DefaultComboBoxModel) cbbDeGiay.getModel();
        for (ViewDeGiayResponse deGiayResponse : listDeGiay) {
            dcbm.addElement(deGiayResponse.getTen());
        }
    }

    private void loadThuongHieu(List<ViewThuongHieuReposponse> listThuongHieu) {
        dcbm = (DefaultComboBoxModel) cbbThuongHieu.getModel();
        for (ViewThuongHieuReposponse thuongHieuReposponse : listThuongHieu) {
            dcbm.addElement(thuongHieuReposponse.getTen());
        }
    }

    private void loadMau(List<ViewMauSacReponse> listMau) {
        dcbm = (DefaultComboBoxModel) cbbMauSac.getModel();
        for (ViewMauSacReponse mauSacReponse : listMau) {
            dcbm.addElement(mauSacReponse.getTen());
        }
    }

    private void loadSanPham(List<ViewSanPhamResponse> listSanPham) {
        dcbm = (DefaultComboBoxModel) cbbMaSP.getModel();
        for (ViewSanPhamResponse sanPhamResponse : listSanPham) {
            dcbm.addElement(sanPhamResponse.getMaSP());
        }
    }

    private void loadTable(List<ViewChiTietSPResponse> list) {
        dtm = (DefaultTableModel) tblChiTietSP.getModel();
        dtm.setRowCount(0);
        for (ViewChiTietSPResponse response : list) {
            dtm.addRow(new Object[]{
                response.getId(), response.getMaSP(), response.getMauSac(),
                response.getNCC(), response.getThuongHieu(), response.getDeGiay(),
                response.getSize(), response.getGia(), response.getSoLuongTon(),
                response.getTrangThai()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChiTietSP = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        cbbMaSP = new javax.swing.JComboBox<>();
        cbbThuongHieu = new javax.swing.JComboBox<>();
        cbbNCC = new javax.swing.JComboBox<>();
        cbbSize = new javax.swing.JComboBox<>();
        cbbMauSac = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbbDeGiay = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        txtSoLuongTon = new javax.swing.JTextField();
        rdoCon = new javax.swing.JRadioButton();
        rdoKhong = new javax.swing.JRadioButton();
        btnDoc = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblChiTietSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MaSP", "MauSac", "ThuongHieu", "NCC", "DeGiay", "Size", "Gia", "SoLuongTon", "TrangThai"
            }
        ));
        tblChiTietSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChiTietSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblChiTietSP);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chi Tiết Sản Phẩm");

        jLabel2.setText("ID");

        jLabel3.setText("MaSP");

        jLabel4.setText("MauSac");

        jLabel5.setText("Thương hiệu");

        jLabel6.setText("NCC");

        jLabel7.setText("Size");

        jLabel8.setText("DeGiay");

        jLabel9.setText("SoLuongTon");

        jLabel10.setText("Gía");

        jLabel11.setText("TrangThai");

        buttonGroup1.add(rdoCon);
        rdoCon.setText("Còn");

        buttonGroup1.add(rdoKhong);
        rdoKhong.setText("Không");

        btnDoc.setText("Đọc");
        btnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID)
                            .addComponent(cbbMaSP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbThuongHieu, 0, 169, Short.MAX_VALUE)
                            .addComponent(cbbNCC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbMauSac, 0, 169, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(57, 57, 57)
                                .addComponent(cbbDeGiay, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(77, 77, 77)
                                .addComponent(txtGia))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(74, 74, 74)
                                .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdoCon)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdoKhong)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtSoLuongTon))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cbbDeGiay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbbThuongHieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtSoLuongTon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbbNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(rdoCon)
                    .addComponent(rdoKhong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        loadTable(chiTietSPService.getAll());
    }//GEN-LAST:event_btnDocActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        ChiTietSP ctsp = new ChiTietSP();
        ctsp.setGia(BigDecimal.valueOf(Double.valueOf(txtGia.getText())));
        ctsp.setSoLuongTon(Integer.parseInt(txtSoLuongTon.getText()));
        int maSP = cbbMaSP.getSelectedIndex();
        SanPham sanPham = chiTietSPService.getSP().get(maSP);
        ctsp.setSanPham(sanPham);
        int mauSac = cbbMauSac.getSelectedIndex();
        MauSac ms = chiTietSPService.getMauSac().get(mauSac);
        ctsp.setMauSac(ms);
        int ncc = cbbNCC.getSelectedIndex();
        NhaCungCap nhaCungCap = chiTietSPService.getNCC().get(ncc);
        ctsp.setNhaCungCap(nhaCungCap);
        int th = cbbThuongHieu.getSelectedIndex();
        ThuongHieu thuongHieu = chiTietSPService.getTH().get(th);
        ctsp.setThuongHieu(thuongHieu);
        int deGiay = cbbDeGiay.getSelectedIndex();
        DeGiay dg = chiTietSPService.getDeGiay().get(deGiay);
        ctsp.setDeGiay(dg);
        int soSize = cbbSize.getSelectedIndex();
        Size size = chiTietSPService.getSize().get(soSize);
        ctsp.setSize(size);

        if (!chiTietSPService.create(ctsp)) {
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            loadTable(chiTietSPService.getAll());
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int row = tblChiTietSP.getSelectedRow();
        ChiTietSP ctsp = new ChiTietSP();
        String idChiTietSP = null;
        for (SanPham sanPham : banHangService.getAllSanPham()) {
            if (sanPham.getMa().equals(cbbMaSP.getSelectedItem())) {
                ChiTietSP chiTietSP = sanPham.getListChiTietSP().get(0);
                idChiTietSP = chiTietSP.getId();
            }
        }
        int ncc = cbbNCC.getSelectedIndex();
        NhaCungCap nhaCungCap = chiTietSPService.getNCC().get(ncc);
        ctsp.setNhaCungCap(nhaCungCap);

        int soSize = cbbSize.getSelectedIndex();
        Size size = chiTietSPService.getSize().get(soSize);
        ctsp.setSize(size);

        int deGiay = cbbDeGiay.getSelectedIndex();
        DeGiay dg = chiTietSPService.getDeGiay().get(deGiay);
        ctsp.setDeGiay(dg);

        int th = cbbThuongHieu.getSelectedIndex();
        ThuongHieu thuongHieu = chiTietSPService.getTH().get(th);
        ctsp.setThuongHieu(thuongHieu);

        int mauSac = cbbMauSac.getSelectedIndex();
        MauSac ms = chiTietSPService.getMauSac().get(mauSac);
        ctsp.setMauSac(ms);

        int maSP = cbbMaSP.getSelectedIndex();
        SanPham sanPham = chiTietSPService.getSP().get(maSP);
        ctsp.setSanPham(sanPham);

        ctsp.setGia(BigDecimal.valueOf(Double.valueOf(txtGia.getText())));
        ctsp.setSoLuongTon(Integer.parseInt(txtSoLuongTon.getText()));

        ctsp.setId(idChiTietSP);

        if (chiTietSPService.create(ctsp)) {
            JOptionPane.showMessageDialog(this, "Update thành công");
            loadTable(chiTietSPService.getAll());
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblChiTietSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTietSPMouseClicked
        int row = tblChiTietSP.getSelectedRow();
        cbbMaSP.getModel().setSelectedItem(tblChiTietSP.getValueAt(row, 1));
        cbbMauSac.getModel().setSelectedItem(tblChiTietSP.getValueAt(row, 2));
        cbbThuongHieu.getModel().setSelectedItem(tblChiTietSP.getValueAt(row, 3));
        cbbNCC.getModel().setSelectedItem(tblChiTietSP.getValueAt(row, 4));
        cbbDeGiay.getModel().setSelectedItem(tblChiTietSP.getValueAt(row, 5));
        cbbSize.getModel().setSelectedItem(tblChiTietSP.getValueAt(row, 6));
        txtGia.setText(tblChiTietSP.getValueAt(row, 7).toString());
        txtSoLuongTon.setText(tblChiTietSP.getValueAt(row, 8).toString());
    }//GEN-LAST:event_tblChiTietSPMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewChiTietSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewChiTietSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewChiTietSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewChiTietSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewChiTietSP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbDeGiay;
    private javax.swing.JComboBox<String> cbbMaSP;
    private javax.swing.JComboBox<String> cbbMauSac;
    private javax.swing.JComboBox<String> cbbNCC;
    private javax.swing.JComboBox<String> cbbSize;
    private javax.swing.JComboBox<String> cbbThuongHieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoCon;
    private javax.swing.JRadioButton rdoKhong;
    private javax.swing.JTable tblChiTietSP;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSoLuongTon;
    // End of variables declaration//GEN-END:variables
}
