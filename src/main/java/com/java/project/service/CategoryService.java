package com.java.project.service;


import com.java.project.entity.Category;
import com.java.project.repo.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository){
        this.repository = repository;
    }

    public Category findById(Long id){
        return  repository.findById(id).get();
    }



}
