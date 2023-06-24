package com.example.hospital.service.Impl;

import com.example.hospital.entity.*;
import com.example.hospital.mapper.StoreMapper;
import com.example.hospital.service.StoreService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class StoreServiceImpl implements StoreService {

    @Resource
    private StoreMapper sm;

    @Override
    //查询库房药品信息
    public List<Drugstore> selStore(Drugstore drugstore) {
        return sm.selStore(drugstore);
    }

    @Override
    public List<Type> seltype(Type type) {
        return sm.seltype(type);
    }



    @Override
    public List<Upplier> selupplier(Upplier upplier) {
        return sm.selupplier(upplier);
    }

    @Override
    public int updrugstore(Drugstore drugstore) {
        return sm.updrugstore(drugstore);
    }

    @Override
    public List<Warehouse> selwarehouse(Warehouse warehouse) {
        return sm.selwarehouse(warehouse);
    }


    @Override
    public List<Drugstore> selectlackdrug(Drugstore drugstore) {
        return sm.selectlackdrug(drugstore);
    }

    @Override
    public int selcountless() {
        return sm.selcountless();
    }

    @Override
    public int addpurchase(Purchase purchase) {
        return sm.addpurchase(purchase);
    }

    @Override
    public int selpurchasename(Purchase purchase) {
        return sm.selpurchasename(purchase);
    }

    @Override
    public int uppurchasenumber(Purchase purchase) {
        return sm.uppurchasenumber(purchase);
    }

    @Override
    public List<Purchase> selpurchase(Purchase purchase) {
        return sm.selpurchase(purchase);
    }

    @Override
    public int delpurchase(Integer purchaseid) {
        return sm.delpurchase(purchaseid);
    }

    @Override
    public List<Drugstore> seldrugDate(Drugstore drugstore) {
        return sm.seldrugDate(drugstore);
    }

    @Override
    public int selcountlessnum() {
        return sm.selcountlessnum();
    }

    @Override
    public int delexpiredurg(Integer drugstoreId) {
        return sm.delexpiredurg(drugstoreId);
    }


}
