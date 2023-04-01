package javaproject.solo.team.repository;

import javaproject.solo.team.entity.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRepository extends JpaRepository<Coin, Integer> {

}
