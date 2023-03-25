package com.devsuperior.dscatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dscatalog.dto.CategoryDto;
import com.devsuperior.dscatalog.entity.Category;
import com.devsuperior.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository repository;

    public List<CategoryDto> findAll() {
        List<Category> list = repository.findAll();
        return list.stream().map(category -> new CategoryDto(category)).collect(Collectors.toList());

    }
}