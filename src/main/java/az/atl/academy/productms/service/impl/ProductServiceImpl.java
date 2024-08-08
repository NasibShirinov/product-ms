package az.atl.academy.productms.service.impl;

import az.atl.academy.productms.dao.entity.ProductEntity;
import az.atl.academy.productms.dao.repository.ProductRepository;
import az.atl.academy.productms.exception.ProductNotFoundException;
import az.atl.academy.productms.mapper.ProductMapper;
import az.atl.academy.productms.model.requestDto.ProductRequestDto;
import az.atl.academy.productms.model.responseDto.ProductResponseDto;
import az.atl.academy.productms.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductMapper productMapper;
    private final ProductRepository productRepository;


    @Override
    public ProductResponseDto createProduct(ProductRequestDto productRequestDto) {
        ProductEntity productEntity = productMapper.toEntity(productRequestDto);
        productRepository.save(productEntity);
        return productMapper.toDto(productEntity);
    }

    @Override
    public ProductResponseDto findById(Long id) {
        return productRepository.findById(id)
                .map(productMapper :: toDto)
                .orElseThrow(() -> new ProductNotFoundException("Product is not found by id: " + id));
    }

    @Override
    public List<ProductResponseDto> findAllAuthors() {
        return productRepository.findAll()
                .stream().map(productMapper :: toDto)
                .toList();
    }

    @Override
    public void updateAuthor(ProductRequestDto productRequestDto, Long id) {
        ProductEntity productEntity = productMapper.toEntity(productRequestDto);
        productEntity.setId(id);
        productRepository.save(productEntity);
    }
}
