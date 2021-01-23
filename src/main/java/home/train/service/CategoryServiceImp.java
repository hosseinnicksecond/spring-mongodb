package home.train.service;

import home.train.document.Category;

import java.util.HashSet;
import java.util.Set;

import home.train.repository.CategoryRepository;

public class CategoryServiceImp implements CategoryService{

    private final CategoryRepository categoryRepository;

    public CategoryServiceImp(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Set<Category> allCategory() {
        Set<Category> categories= new HashSet<>();
        categoryRepository.findAll().forEach(categories::add);
        return categories;
    }

    @Override
    public Category findById(String id) {
       return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void deleteById(String id) {
        categoryRepository.deleteById(id);
    }
}