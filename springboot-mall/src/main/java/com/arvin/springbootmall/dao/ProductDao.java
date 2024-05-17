package com.arvin.springbootmall.dao;


import com.arvin.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
