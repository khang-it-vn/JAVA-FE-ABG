package javaproject.solo.team.service;

import javaproject.solo.team.entity.Coin;
import javaproject.solo.team.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();

    Product save(Product product);

    Product getById(Integer id);
    Product update(Product product);

    void deleteById(Integer id);

}
