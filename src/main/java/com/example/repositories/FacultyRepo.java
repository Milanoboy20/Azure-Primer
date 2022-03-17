package com.example.repositories;


import com.example.models.Faculty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepo extends CrudRepository<Faculty, Integer> {

}
