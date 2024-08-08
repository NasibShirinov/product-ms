package az.atl.academy.productms.service;

import az.atl.academy.productms.model.requestDto.ProductRequestDto;
import az.atl.academy.productms.model.responseDto.ProductResponseDto;

import java.util.List;

public interface ProductService {
    ProductResponseDto createProduct(ProductRequestDto authorRequestDto);
    ProductResponseDto findById(Long id);
    List<ProductResponseDto> findAllAuthors();
    void updateAuthor(ProductRequestDto authorRequestDto, Long id);
}
