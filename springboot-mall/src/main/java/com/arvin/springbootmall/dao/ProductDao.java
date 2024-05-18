package com.arvin.springbootmall.dao;


import com.arvin.springbootmall.dto.ProductRequest;
import com.arvin.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
