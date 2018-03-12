package com.zmy.wechatsell.service.impl;

import com.zmy.wechatsell.entity.SellerInfo;
import com.zmy.wechatsell.repository.SellerInfoRepository;
import com.zmy.wechatsell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}

