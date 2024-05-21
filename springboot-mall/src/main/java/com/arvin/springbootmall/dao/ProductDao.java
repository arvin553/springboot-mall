package com.arvin.springbootmall.dao;


import com.arvin.springbootmall.constant.ProductCategory;
import com.arvin.springbootmall.dto.ProductRequest;
import com.arvin.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category,String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
