package dataAccsess;

import entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {

		System.out.println("Jdbc ile Veritaban�na Eklendi:"+course.getCourseName());
		
	}


}
