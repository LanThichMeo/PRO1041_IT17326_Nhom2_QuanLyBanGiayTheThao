
package com.poly.it17326.group2.service.impl;

import com.poly.it17326.group2.domainmodel.SanPham;
import com.poly.it17326.group2.repository.SanPhamRepository;
import com.poly.it17326.group2.response.ViewSanPhamResponse;
import com.poly.it17326.group2.service.ICommon;
import java.util.ArrayList;
import java.util.List;

public class SanPhamServiceImpl implements ICommon<ViewSanPhamResponse, SanPham>{

    private SanPhamRepository sanPhamRepository = new SanPhamRepository();
    
    @Override
    public List<ViewSanPhamResponse> getAll() {
        List<ViewSanPhamResponse> response = new ArrayList<>();
        List<SanPham> list = sanPhamRepository.getAll();
        for (SanPham sanPham : list) {
            ViewSanPhamResponse sanPhamResponse = new ViewSanPhamResponse(sanPham);
            response.add(sanPhamResponse);
        }
        return response;
    }

    @Override
    public Boolean create(SanPham y) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean update(SanPham y) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
