package home.train.service;

import home.train.document.Category;

import java.util.Set;

public interface CategoryService {

    Set<Category> allCategory();
    Category findById(String id);
    Category save(Category category);
    void deleteById(String id);
}
