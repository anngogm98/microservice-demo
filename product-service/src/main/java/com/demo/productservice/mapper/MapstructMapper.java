package com.demo.productservice.mapper;

import com.demo.productservice.dto.ProductResponse;
import com.demo.productservice.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MapstructMapper {
    MapstructMapper INSTANCE = Mappers.getMapper(MapstructMapper.class);

    List<ProductResponse> productsToProductResponses(List<Product> products);
}
