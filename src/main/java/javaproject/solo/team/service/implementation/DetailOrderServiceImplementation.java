package javaproject.solo.team.service.implementation;

import javaproject.solo.team.entity.Coin;
import javaproject.solo.team.entity.DetailOrder;
import javaproject.solo.team.entity.DetailOrderId;
import javaproject.solo.team.repository.CoinRepository;
import javaproject.solo.team.repository.DetailOrerRepository;
import javaproject.solo.team.service.DetailOrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailOrderServiceImplementation implements DetailOrderService {
    private DetailOrerRepository repository;
    public  DetailOrderServiceImplementation(DetailOrerRepository detailOrerRepository)
    {
        super();
        this.repository = detailOrerRepository;
    }
    @Override
    public List<DetailOrder> getAll() {
        return this.repository.findAll();
    }

    @Override
    public DetailOrder save(DetailOrder detailOrder) {
        return this.repository.save(detailOrder);
    }

    @Override
    public DetailOrder getById(DetailOrderId id) {
        return this.repository.findById(id).get();
    }

    @Override
    public DetailOrder update(DetailOrder detailOrder) {
        return this.repository.save(detailOrder);
    }

    @Override
    public void deleteById(DetailOrderId id) {
        this.repository.deleteById(id);
    }

}
