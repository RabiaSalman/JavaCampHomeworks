package dataAccsess;

import entities.Instructor;

public class JdbcInstructor implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
	
		System.out.println("Jdbc ile Veritabanưna Eklendi:"+instructor.getFullName());
	}



}
