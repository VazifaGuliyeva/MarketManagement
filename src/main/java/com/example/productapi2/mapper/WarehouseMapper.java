package com.example.productapi2.mapper;

import com.example.productapi2.dto.warehouseDto.WarehouseDto;
import com.example.productapi2.entity.Warehouse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WarehouseMapper {

    WarehouseDto toWarehouseDto(Warehouse warehouse);

    Warehouse toWareHouse(WarehouseDto warehouseDto);


}
