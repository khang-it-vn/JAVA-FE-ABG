package javaproject.solo.team.repository;

import javaproject.solo.team.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}