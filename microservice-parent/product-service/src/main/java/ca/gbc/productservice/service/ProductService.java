package ca.gbc.productservice.service;

import ca.gbc.productservice.dto.ProductRequest;
import ca.gbc.productservice.dto.ProductResponse;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {

    ProductResponse createProduct(ProductRequest productRequest);
    List<ProductResponse> getAllProduct();
    String updateProduct(String id,
                  ProductRequest productRequest);

    void deleteProduct(String productId);
}
