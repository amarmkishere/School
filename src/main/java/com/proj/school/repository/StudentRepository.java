package com.proj.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.proj.school.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

	
	
}
