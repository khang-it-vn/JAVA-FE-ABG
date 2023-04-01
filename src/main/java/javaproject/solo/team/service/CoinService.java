package javaproject.solo.team.service;

import javaproject.solo.team.entity.Coin;

import java.util.List;

public interface CoinService {
    List<Coin> getAll();

    Coin save(Coin coin);

    Coin getById(Integer id);

    Coin update(Coin coin);

    void deleteById(Integer id);
}
