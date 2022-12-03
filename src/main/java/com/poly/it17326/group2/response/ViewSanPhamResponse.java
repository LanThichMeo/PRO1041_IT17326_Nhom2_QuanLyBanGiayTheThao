package com.poly.it17326.group2.response;
//
import com.poly.it17326.group2.domainmodel.SanPham;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ViewSanPhamResponse {

    private String id;
    private String maSP;
    private String tenSP;
    private String tenAnh;
    private String url;
    private String ngayTao;
    private String ngaySua;
    private Integer trangThai;

    public ViewSanPhamResponse() {
    }

    public ViewSanPhamResponse(SanPham sanPham) {
        this.id = sanPham.getId();
        this.maSP = sanPham.getMa();
        this.tenSP = sanPham.getTen();
        this.tenAnh = sanPham.getTenAnh();
        this.url = sanPham.getUrl();
        this.ngayTao = sanPham.getNgayTao();
        this.ngaySua = sanPham.getNgaySua();
        this.trangThai = sanPham.getTrangThai();
    }
        
    public String hTTrangThai(){
        if(trangThai==1){
            return "Còn Kinh Doanh";
        }else{
            return "Không còn hoạt động";
        }
    }
    
}
