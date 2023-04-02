package javaproject.solo.team.service.implementation;

import javaproject.solo.team.entity.Account;
import javaproject.solo.team.entity.Admin;
import javaproject.solo.team.repository.AccountRepository;
import javaproject.solo.team.repository.AdminRepository;
import javaproject.solo.team.service.AdminService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImplementation implements AdminService {
    private AdminRepository repository;
    public  AdminServiceImplementation(AdminRepository adminRepository)
    {
        super();
        this.repository = adminRepository;
    }
    @Override
    public List<Admin> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Admin save(Admin admin) {
        return this.repository.save(admin);
    }

    @Override
    public Admin getById(Integer id) {
        return this.repository.findById(id).get();
    }

    @Override
    public Admin update(Admin admin) {
        return this.repository.save(admin);
    }

    @Override
    public void deleteById(Integer id) {
        this.repository.deleteById(id);
    }
}
