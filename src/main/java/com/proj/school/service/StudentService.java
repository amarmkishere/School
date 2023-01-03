package com.proj.school.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.school.entity.Student;
import com.proj.school.repository.StudentRepository;
@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List getAllStudents() {
        List<Student> students = new ArrayList<Student>();
        studentRepository.findAll().forEach(stud->students.add(stud));
        return students;
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }

    public void saveOrUpdate(Student student) {
    	studentRepository.save(student);
    }

    public void delete(int id) {
    	studentRepository.deleteById(id);
    }
}
