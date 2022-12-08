package com.schoolapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolapp.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
