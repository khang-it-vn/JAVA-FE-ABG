package javaproject.solo.team.service;

import javaproject.solo.team.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();

    Category save(Category category);

    Category getById(Integer id);

    Category update(Category category);

    void deleteById(Integer id);
}
