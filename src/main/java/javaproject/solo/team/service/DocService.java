package javaproject.solo.team.service;

import javaproject.solo.team.entity.Doc;

import java.util.List;

public interface DocService {
    List<Doc> getAll();

    Doc save(Doc Doc);

    Doc getById(Integer id);

    Doc update(Doc Doc);

    void deleteById(Integer id);
}
