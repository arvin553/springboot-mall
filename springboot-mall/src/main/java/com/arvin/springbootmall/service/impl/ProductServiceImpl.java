package com.arvin.springbootmall.service.impl;

import com.arvin.springbootmall.dao.ProductDao;
import com.arvin.springbootmall.dto.ProductRequest;
import com.arvin.springbootmall.model.Product;
import com.arvin.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
