package javaproject.solo.team.service.implementation;

import javaproject.solo.team.entity.Doc;
import javaproject.solo.team.entity.Order;
import javaproject.solo.team.repository.OrderRepository;
import javaproject.solo.team.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImplementation implements OrderService {
    private OrderRepository repository;
    public  OrderServiceImplementation(OrderRepository orderRepository)
    {
        super();
        this.repository = orderRepository;
    }
    @Override
    public List<Order> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Order save(Order order) {
        return this.repository.save(order);
    }

    @Override
    public Order getById(Integer id) {
        return this.repository.findById(id).get();
    }

    @Override
    public Order update(Order order) {
        return this.repository.save(order);
    }

    @Override
    public void deleteById(Integer id) {
        this.repository.deleteById(id);
    }
}
