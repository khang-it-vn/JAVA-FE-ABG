package javaproject.solo.team.service.implementation;

import javaproject.solo.team.entity.Coin;
import javaproject.solo.team.repository.CoinRepository;
import javaproject.solo.team.service.CategoryService;
import javaproject.solo.team.service.CoinService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoinServiceImplementation implements CoinService {
    private CoinRepository repository;
    public  CoinServiceImplementation(CoinRepository coinRepository)
    {
        super();
        this.repository = coinRepository;
    }
    @Override
    public List<Coin> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Coin save(Coin coin) {
        return this.repository.save(coin);
    }

    @Override
    public Coin getById(Integer id) {
        return this.repository.findById(id).get();
    }

    @Override
    public Coin update(Coin coin) {
        return this.repository.save(coin);
    }

    @Override
    public void deleteById(Integer id) {
        this.repository.deleteById(id);
    }
}
