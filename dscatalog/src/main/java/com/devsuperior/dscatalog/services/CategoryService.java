package com.devsuperior.dscatalog.services;

import java.util.List;
import java.util.Optional;
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
        return list.stream().map(CategoryDto::new).collect(Collectors.toList());

    }

    public Optional<CategoryDto> findById(Long id) {
        return repository.findById(id).map(CategoryDto::new);
    }

}
