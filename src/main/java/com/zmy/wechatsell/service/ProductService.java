package com.zmy.wechatsell.service;

import com.zmy.wechatsell.dto.CartDTO;
import com.zmy.wechatsell.entity.OrderDetail;
import com.zmy.wechatsell.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);


    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

}
