package dataAccsess;

import entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {

		System.out.println("Jdbc ile Veritabanưna Eklendi:"+course.getCourseName());
		
	}


}
