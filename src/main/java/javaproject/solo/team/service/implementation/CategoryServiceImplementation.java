package javaproject.solo.team.service.implementation;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import javaproject.solo.team.entity.Category;
import javaproject.solo.team.repository.CategoryRepository;
import javaproject.solo.team.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImplementation implements CategoryService {
    private CategoryRepository repository;

    @Autowired
    public  CategoryServiceImplementation(CategoryRepository categoryRepository)
    {
        super();
        this.repository = categoryRepository;
    }
    @Override
    public List<Category> getAll() {
        return repository.findAll();
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
