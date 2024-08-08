package az.atl.academy.productms.mapper;

import az.atl.academy.productms.dao.entity.ProductEntity;
import az.atl.academy.productms.model.requestDto.ProductRequestDto;
import az.atl.academy.productms.model.responseDto.ProductResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface ProductMapper {
    ProductEntity toEntity(ProductRequestDto authorRequestDto);
    ProductResponseDto toDto(ProductEntity authorEntity);
}
