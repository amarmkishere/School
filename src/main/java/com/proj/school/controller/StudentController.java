package com.proj.school.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proj.school.entity.Stdnt;
import com.proj.school.entity.Student;
import com.proj.school.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	private List getAllEmployees() {
		return studentService.getAllStudents();
	}

	@GetMapping("/students/{id}")
	private Student getStudentById(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	}

	@PostMapping(path = "/students")
	private ResponseEntity createStudent(@RequestBody Stdnt stdnt) {
		Student student= new Student();
		BeanUtils.copyProperties(stdnt, student);
		try {
			studentService.saveOrUpdate(student);
		} catch (Exception exception) {
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity("New student created with id: " + student.getId(), HttpStatus.CREATED);
	}

	@DeleteMapping("/students/{id}")
	private ResponseEntity deleteById(@PathVariable("id") int id) {
		try {
			studentService.delete(id);
		} catch (Exception exception) {
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity("Student deleted with id: " + id, HttpStatus.OK);
	}

}
