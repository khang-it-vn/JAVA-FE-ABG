package javaproject.solo.team.service.implementation;

import javaproject.solo.team.entity.Account;
import javaproject.solo.team.repository.AccountRepository;
import javaproject.solo.team.service.AccountService;

import java.util.List;

public class AccountServiceImplementation implements AccountService {

    private AccountRepository repository;
    public  AccountServiceImplementation(AccountRepository accountRepository)
    {
        super();
        this.repository = accountRepository;
    }
    @Override
    public List<Account> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Account save(Account account) {
        return this.repository.save(account);
    }

    @Override
    public Account getById(Integer id) {
        return this.repository.findById(id).get();
    }

    @Override
    public Account update(Account account) {
        return this.repository.save(account);
    }

    @Override
    public void deleteById(Integer id) {
        this.repository.deleteById(id);
    }
}
