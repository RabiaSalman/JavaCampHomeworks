package business;

import java.util.List;

import core.Logger;
import dataAccsess.CourseDao;
import entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;
	
	public CourseManager(CourseDao courseDao,Logger[] loggers,List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers=loggers;
		this.courses=courses;
	}


	public void add(Course course) throws Exception {
		
	   if(course.getPrice()<0) {
		 throw new Exception("Kurs Fiyat� 0'dan K���k Olamaz!");
	   }
	   
	   for(Course course1:courses) {
		   if (course1.getCourseName().contains(course1.getCourseName())) {
				throw new Exception("Kurs ismi tekrar edemez ");
			}
		   
	   }
	   courseDao.add(course);
	   courses.add(course);
	   
	   
	 
	   for(Logger logger:loggers) {
		   
		   logger.log(course.getCourseName());	   
		   
	   }	   
		
	}
	

	

}
