package com.example.productapi2.mapper;

import com.example.productapi2.dto.DetailDto;
import com.example.productapi2.entity.Detail;
import com.example.productapi2.service.impl.DetailImpl;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DetailMapper {


    DetailDto toDetailDto(Detail detail);


    Detail toDetail(DetailDto detailDto);


}
