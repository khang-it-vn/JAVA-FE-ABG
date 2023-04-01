package javaproject.solo.team.service;

import javaproject.solo.team.entity.Admin;

import java.util.List;

public interface AdminService {
    List<Admin> getAll();

    Admin save(Admin admin);

    Admin getById(Integer id);

    Admin update(Admin admin);

    void deleteById(Integer id);
}
