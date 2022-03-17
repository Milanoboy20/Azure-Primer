package com.example.repositories;

import com.example.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
