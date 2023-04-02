package javaproject.solo.team.service;

import javaproject.solo.team.entity.Product;
import javaproject.solo.team.entity.TransferDetail;
import javaproject.solo.team.entity.TransferDetailId;

import java.util.List;

public interface TransferDetailService {
    List<TransferDetail> getAll();

    TransferDetail save(TransferDetail transferDetail);

    TransferDetail getById(TransferDetailId id);

    TransferDetail update(TransferDetail transferDetail);

    void deleteById(TransferDetailId id);
}
