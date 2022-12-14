package com.poly.it17326.group2.response;

import com.poly.it17326.group2.domainmodel.TaiKhoan;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
//hocnvph27417
@Getter
@Setter
@ToString
public class ViewTaiKhoanResponse {

    private String id;
    private String ma;
    private String hoTen;
    private String tenTaiKhoan;
    private String ngayTao;
    private String ngaySua;
    private String cccd;
    private String sdt;
    private String matKhau;
    private String tenChucVu;
    private Integer trangThai;

    public ViewTaiKhoanResponse() {
    }

    public ViewTaiKhoanResponse(TaiKhoan taiKhoan) {
        this.id = taiKhoan.getId();
        this.ma = taiKhoan.getMa();
        this.hoTen = taiKhoan.getHoTen();
        this.tenTaiKhoan = taiKhoan.getTenTaiKhoan();
        this.ngayTao = taiKhoan.getNgayTao();
        this.ngaySua = taiKhoan.getNgaySua();
        this.cccd = taiKhoan.getCccd();
        this.sdt = taiKhoan.getSdt();
        this.matKhau = taiKhoan.getMatKhau();
        this.tenChucVu = taiKhoan.getChucVu().getTen();
        this.trangThai = taiKhoan.getTrangThai();
    }  
    
    public String htTrangThai(){
        if(this.trangThai == 1){
            return "Đi làm";
        }
        return "Nghỉ việc";
    }
}
