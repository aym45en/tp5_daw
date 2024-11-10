
package com.example.mysecondproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mysecondproject.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
