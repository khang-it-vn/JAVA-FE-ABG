package javaproject.solo.team.service;

import javaproject.solo.team.entity.DetailOrder;
import javaproject.solo.team.entity.DetailOrderId;

import java.util.List;

public interface DetailOrderService {
    List<DetailOrder> getAll();

    DetailOrder save(DetailOrder detailOrder);

    DetailOrder getById(DetailOrderId id);

    DetailOrder update(DetailOrder detailOrder);

    void deleteById(DetailOrderId id);

}
