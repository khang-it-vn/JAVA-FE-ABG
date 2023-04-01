package javaproject.solo.team.service.implementation;

import javaproject.solo.team.entity.Category;
import javaproject.solo.team.repository.CategoryRepository;
import javaproject.solo.team.service.CategoryService;

import java.util.List;

public class CategoryServiceImplementation implements CategoryService {
    private CategoryRepository repository;
    public  CategoryServiceImplementation(CategoryRepository categoryRepository)
    {
        super();
        this.repository = categoryRepository;
    }
    @Override
    public List<Category> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Category save(Category category) {
        return this.repository.save(category);
    }

    @Override
    public Category getById(Integer id) {
        return this.repository.findById(id).get();
    }

    @Override
    public Category update(Category category) {
        return this.repository.save(category);
    }

    @Override
    public void deleteById(Integer id) {
        this.repository.deleteById(id);
    }
}
