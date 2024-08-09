package az.atl.academy.productms.service;

import az.atl.academy.productms.model.requestDto.ProductRequestDto;
import az.atl.academy.productms.model.responseDto.ProductResponseDto;

import java.util.List;

public interface ProductService {
    ProductResponseDto createProduct(ProductRequestDto productRequestDto);
    ProductResponseDto findById(Long id);
    List<ProductResponseDto> findAllProducts();
    void updateProduct(ProductRequestDto productRequestDto, Long id);
}
