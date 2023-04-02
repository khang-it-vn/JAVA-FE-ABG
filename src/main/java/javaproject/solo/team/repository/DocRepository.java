package javaproject.solo.team.repository;

import javaproject.solo.team.entity.Doc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DocRepository extends JpaRepository<Doc, Integer> {

}
