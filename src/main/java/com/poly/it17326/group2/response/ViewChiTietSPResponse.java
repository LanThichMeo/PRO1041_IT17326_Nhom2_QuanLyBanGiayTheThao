/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17326.group2.response;

import com.poly.it17326.group2.domainmodel.ChiTietSP;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author anhntnph27418
 */
@Getter
@Setter
@ToString
public class ViewChiTietSPResponse {

    private String id;
    private String maSP;
    private String tenSP;
    private String tenAnh;
    private String url;
    private String thuongHieu;
    private String NCC;
    private String mauSac;
    private int size;
    private String deGiay;
    private int soLuongTon;
    private BigDecimal gia;
    private Integer trangThai;
    private BigDecimal tongTien;

    public ViewChiTietSPResponse() {
    }

    public ViewChiTietSPResponse(ChiTietSP chiTietSP) {
        this.id = chiTietSP.getId();
        this.maSP = chiTietSP.getSanPham().getMa();
        this.tenSP = chiTietSP.getSanPham().getTen();
        this.tenAnh = chiTietSP.getSanPham().getTenAnh();
        this.url = chiTietSP.getSanPham().getUrl();
        this.thuongHieu = chiTietSP.getThuongHieu().getTen();
        this.NCC = chiTietSP.getNhaCungCap().getTen();
        this.mauSac = chiTietSP.getMauSac().getTen();
        this.size = chiTietSP.getSize().getTen();
        this.deGiay = chiTietSP.getDeGiay().getTen();
        this.soLuongTon = chiTietSP.getSoLuongTon();
        this.gia = chiTietSP.getGia();
        this.trangThai = chiTietSP.getTrangThai();       
    }
     
    public String hTTrangThai(){
        if(trangThai==1){
            return "Còn Kinh Doanh";
        }else{
            return "Không còn hoạt động";
        }
    }
}
