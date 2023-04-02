package javaproject.solo.team.service.implementation;

import javaproject.solo.team.entity.Product;
import javaproject.solo.team.entity.TransferDetail;
import javaproject.solo.team.entity.TransferDetailId;
import javaproject.solo.team.repository.ProductRepository;
import javaproject.solo.team.repository.TransferRepository;
import javaproject.solo.team.service.TransferDetailService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferDetailServiceImplementation implements TransferDetailService {
    private TransferRepository repository;
    public  TransferDetailServiceImplementation(TransferRepository transferRepository)
    {
        super();
        this.repository = transferRepository;
    }
    @Override
    public List<TransferDetail> getAll() {
        return this.repository.findAll();
    }

    @Override
    public TransferDetail save(TransferDetail transferDetail) {
        return this.repository.save(transferDetail);
    }

    @Override
    public TransferDetail getById(TransferDetailId id) {
        return this.repository.findById(id).get();
    }

    @Override
    public TransferDetail update(TransferDetail d) {
        return this.repository.save(d);
    }

    @Override
    public void deleteById(TransferDetailId id) {
        this.repository.deleteById(id);
    }
}
