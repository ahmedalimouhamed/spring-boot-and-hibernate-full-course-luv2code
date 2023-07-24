package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDao;
import com.luv2code.cruddemo.entity.Student;
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
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return runner -> {
			//createStudent(studentDao);
			//createMultipleStudents(studentDao);
			//readStudent(studentDao);
			//queryForStudents(studentDao);
			queryForStudentsByLastName(studentDao);
		};
	}

	private void queryForStudentsByLastName(StudentDao studentDao) {
		List<Student> theStudents = studentDao.findByLastName("Duck");

		for(Student tempStudent:theStudents){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDao studentDao) {
		List<Student> theStudents = studentDao.findAll();
		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDao studentDao) {
		System.out.println("creating new student Object...");
		Student tempStudent = new Student("daffy", "Duck", "daffy@duck.com");
		System.out.println("saving the student ...");
		studentDao.save(tempStudent);
		int theId = tempStudent.getId();
		System.out.println("saved student, Generated id : "+theId);
		System.out.println("retrieving student with id: "+ theId);
		Student myStudent = studentDao.findById(theId);
		System.out.println("found the student: "+ myStudent);
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
