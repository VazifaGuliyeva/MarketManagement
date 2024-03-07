package com.example.productapi2.service.impl;

import com.example.productapi2.dto.DetailDto;
import com.example.productapi2.entity.Detail;
import com.example.productapi2.mapper.DetailMapper;
import com.example.productapi2.repository.DetailRepository;
import com.example.productapi2.service.DetailService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
public class DetailImpl implements DetailService {

    private final DetailRepository detailRepository;

    private final DetailMapper detailMapper;
    @Override
    public List<DetailDto> getAll() {
        return detailRepository.findAll().stream().map(detailMapper::toDetailDto).toList();
    }

    @Override
    public DetailDto getDetailById(int id) {
        return detailRepository.findById(id).stream().map(detailMapper::toDetailDto).findFirst().get();
    }

    @Override
    public void addDetail(DetailDto detailDto) {


        Detail detail=new Detail();

        detail.setPrice(detailDto.getPrice());
        detail.setCreationDate(detailDto.getCreationDate());
        detail.setExpireDate(detailDto.getExpireDate());
        detail.setColor(detailDto.getColor());
        detail.setDescription(detailDto.getDescription());
        detail.setFileUrl(detailDto.getFileUrl());

        detailRepository.save(detail);

    }

    @Override
    public void deleteDetail(int id) {

        detailRepository.deleteById(id);;

    }

    @Override
    public List<DetailDto> getAllByColor(String color) {
        return detailRepository.findAllByColor(color).stream().map(detailMapper::toDetailDto).toList();
    }
}
