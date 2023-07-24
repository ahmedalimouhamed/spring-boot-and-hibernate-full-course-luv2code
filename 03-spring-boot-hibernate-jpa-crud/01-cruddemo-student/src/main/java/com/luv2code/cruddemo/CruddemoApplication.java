package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDao;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return runner -> {
			//createStudent(studentDao);
			createMultipleStudents(studentDao);
		};
	}

	private void createMultipleStudents(StudentDao studentDao) {
		System.out.println("Creating new student object ...");
		Student tempStudent1 = new Student("paul", "doe", "paul@doe.com");
		Student tempStudent2 = new Student("ahmed", "ali", "ahmed@ali.com");
		Student tempStudent3 = new Student("amina", "alami", "amina@alami.com");

		System.out.println("Saving the students...");
		studentDao.save(tempStudent1);
		studentDao.save(tempStudent2);
		studentDao.save(tempStudent3);
	}

	private void createStudent(StudentDao studentDao) {
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("paul", "doe", "paul@doe.com");
		System.out.println("Saving the student...");
		studentDao.save(tempStudent);
		System.out.println("saved student. Generated id : "+tempStudent.getId());
	}
}
