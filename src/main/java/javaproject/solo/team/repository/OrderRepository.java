package javaproject.solo.team.repository;

import javaproject.solo.team.entity.Doc;
import javaproject.solo.team.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}