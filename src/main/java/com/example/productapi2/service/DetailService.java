package com.example.productapi2.service;

//import com.example.productapi2.dto.CompanyDto;
import com.example.productapi2.dto.DetailDto;

import java.util.List;

public interface DetailService {

    List<DetailDto> getAll();


    DetailDto getDetailById(int id);

    void addDetail(DetailDto detailDto);

    void deleteDetail(int id);

    List<DetailDto> getAllByColor(String color);
}
