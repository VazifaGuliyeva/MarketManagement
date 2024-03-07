package com.example.productapi2.controller;

import com.example.productapi2.dto.DetailDto;
import com.example.productapi2.entity.Detail;
import com.example.productapi2.service.impl.DetailImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/details")
@AllArgsConstructor
public class DetailController {

    private final DetailImpl detailImpl;

    @GetMapping
    public List<DetailDto> getAll() {
        return detailImpl.getAll();
    }
    @GetMapping("/color/{color}")
    public List<DetailDto> getAllByColor(@PathVariable String color) {
        return detailImpl.getAllByColor(color);
    }

    @GetMapping("/{id}")
    public DetailDto getDetailById(@PathVariable int id) {
        return detailImpl.getDetailById(id);
    }

    @PostMapping
    public void addDetail(@RequestBody DetailDto detailDto) {

        detailImpl.addDetail(detailDto);

    }

    @DeleteMapping("/{id}")
    public void deleteDetail(@PathVariable int id) {


    }
}
