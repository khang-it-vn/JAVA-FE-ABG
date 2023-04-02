package javaproject.solo.team.repository;

import javaproject.solo.team.entity.Order;
import javaproject.solo.team.entity.TransferDetail;
import javaproject.solo.team.entity.TransferDetailId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<TransferDetail, TransferDetailId> {
}
