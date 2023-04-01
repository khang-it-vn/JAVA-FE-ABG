package javaproject.solo.team.service;

import javaproject.solo.team.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAll();

    Account save(Account account);

    Account getById(Integer id);

    Account update(Account account);

    void deleteById(Integer id);
}
