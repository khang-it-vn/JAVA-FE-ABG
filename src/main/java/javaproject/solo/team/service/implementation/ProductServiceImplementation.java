package javaproject.solo.team.service.implementation;

import javaproject.solo.team.entity.Doc;
import javaproject.solo.team.entity.Product;
import javaproject.solo.team.repository.DocRepository;
import javaproject.solo.team.repository.ProductRepository;
import javaproject.solo.team.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService {

    private ProductRepository repository;
    public  ProductServiceImplementation(ProductRepository productRepository)
    {
        super();
        this.repository = productRepository;
    }
    @Override
    public List<Product> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Product save(Product product) {
        return this.repository.save(product);
    }

    @Override
    public Product getById(Integer id) {
        return this.repository.findById(id).get();
    }

    @Override
    public Product update(Product d) {
        return this.repository.save(d);
    }

    @Override
    public void deleteById(Integer id) {
        this.repository.deleteById(id);
    }
}
