package az.atl.academy.productms.controller;

import az.atl.academy.productms.model.requestDto.ProductRequestDto;
import az.atl.academy.productms.model.responseDto.ProductResponseDto;
import az.atl.academy.productms.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ProductResponseDto createProduct(@RequestBody ProductRequestDto productRequestDto) {
        return productService.createProduct(productRequestDto);
    }

    @GetMapping("/{id}")
    public ProductResponseDto findById(@PathVariable Long id){
        return productService.findById(id);
    }

    @GetMapping
    public List<ProductResponseDto> findAll(){
        return productService.findAllAuthors();
    }

    @PutMapping
    public void updateAuthor (@RequestBody ProductRequestDto productRequestDto, @PathVariable Long id){
        productService.updateAuthor(productRequestDto, id);
    }
}
