package com.example.onetoonemapping.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetoonemapping.models.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long>{

}