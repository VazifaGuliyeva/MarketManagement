package com.example.productapi2.service.impl;

import com.example.productapi2.dto.orderDto.OrderReqeustDto;
import com.example.productapi2.dto.orderDto.OrderResponseDto;
import com.example.productapi2.entity.Category;
import com.example.productapi2.entity.Order;
import com.example.productapi2.entity.Product;
import com.example.productapi2.entity.Warehouse;
import com.example.productapi2.repository.OrderRepository;
import com.example.productapi2.repository.ProductRepository;
import com.example.productapi2.repository.WarehouseRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
public class OrderImpl {

    ProductRepository productRepository;

    WarehouseRepository warehouseRepository;

    OrderRepository orderRepository;


    public OrderResponseDto order(OrderReqeustDto orderReqeustDto){
        Product product=productRepository.findAllByName(orderReqeustDto.getFkProductId());

        if(product!= null){
            List<Warehouse> warehouses=warehouseRepository.findAll();

            for(Warehouse warehouse:warehouses){
                if(warehouse.getFkProductId().contains((CharSequence) product)){

                    Order order=new Order();
                    order.setFkProductId(product.getId());
                    order.setCategory(product.getFkCategoryId());
                    order.setFkWarehhouseId(product.getFkWarehouseId());
                    orderRepository.save(order);
                }else{

                }
            }
        }


    }





}
