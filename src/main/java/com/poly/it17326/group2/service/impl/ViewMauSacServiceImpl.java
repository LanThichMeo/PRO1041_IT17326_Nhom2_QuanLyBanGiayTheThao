/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17326.group2.service.impl;

import com.poly.it17326.group2.domainmodel.MauSac;
import com.poly.it17326.group2.repository.MauSacRepository;
import com.poly.it17326.group2.response.ViewMauSacReponse;
import com.poly.it17326.group2.service.ICommon;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phuongktph26630
 */
public class ViewMauSacServiceImpl implements ICommon<ViewMauSacReponse, MauSac> {

    private MauSacRepository sizeRepository = new MauSacRepository();

    @Override
    public List<ViewMauSacReponse> getAll() {
        List<ViewMauSacReponse> listReponse = new ArrayList<>();
        List<MauSac> listSize = sizeRepository.getListFromDB();// lấy dữ liệu từ repository
        for (MauSac mauSac : listSize) {
            ViewMauSacReponse viewSizeReponse = new ViewMauSacReponse(mauSac);
            listReponse.add(viewSizeReponse);
        }
        return listReponse;
    }

    @Override
    public Boolean create(MauSac mauSac) {
        return sizeRepository.addNew(mauSac);
    }

    @Override
    public Boolean update(MauSac mauSac) {
        return sizeRepository.upDate(mauSac);
    }

    @Override
    public Boolean delete(String id) {
        return sizeRepository.delete(id);
    }

}
