package javaproject.solo.team.repository;

import javaproject.solo.team.entity.DetailOrder;
import javaproject.solo.team.entity.DetailOrderId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailOrerRepository extends JpaRepository<DetailOrder, DetailOrderId> {
}
