package javaproject.solo.team.service;

import javaproject.solo.team.entity.DetailOrder;

import java.util.List;

public interface DetailOrderService {
    List<DetailOrder> getAll();

    DetailOrder save(DetailOrder detailOrder);

    DetailOrder getById(Integer id);

    DetailOrder update(DetailOrder detailOrder);

    void deleteById(Integer id);
}
