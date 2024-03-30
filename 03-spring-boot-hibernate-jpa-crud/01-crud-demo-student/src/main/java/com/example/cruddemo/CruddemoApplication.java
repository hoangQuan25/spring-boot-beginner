package com.example.cruddemo;

import com.example.cruddemo.dao.StudentDAO;
import com.example.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			/*
			 updateStudent(studentDAO);
			 deleteStudent(studentDAO);
			 findAllStudent(studentDAO);
			*/
			// deleteAllStudents(studentDAO);
			createMultipleStudents(studentDAO);
        };
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		Student student1 = new Student("Varen", "Heim", "skdlajfdal@gmail.com");
		Student student2 = new Student("Topaz", "Arkangel", "aaasdfasd@gmail.com");
		Student student3 = new Student("Stephen", "Bunderstadt", "sdfsdaf@gmail.com");

		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student3);
	}

	private void updateStudent(StudentDAO studentDAO) {
		int studentId = 1;
		Student myStudent = studentDAO.findById(studentId);
		myStudent.setFirstName("Patrick");
		studentDAO.update(myStudent);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 4;
		studentDAO.delete(studentId);
	}

	private void findAllStudent(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();
		for (Student student : students) {
			System.out.println(student.toString() + "\n");
		}
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted: " + numRowsDeleted + " rows from table student");
	}
}
