package javaproject.solo.team.service;

import javaproject.solo.team.entity.Coin;
import javaproject.solo.team.entity.Doc;
import javaproject.solo.team.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAll();

    Order save(Order order);

    Order getById(Integer id);

    Order update(Order order);

    void deleteById(Integer id);
}
