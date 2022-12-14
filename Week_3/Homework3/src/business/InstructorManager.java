package business;

import core.Logger;
import dataAccsess.InstructorDao;
import entities.Instructor;

public class InstructorManager {

	private InstructorDao żnstructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao żnstructorDao, Logger[] loggers) {
		
		this.żnstructorDao=żnstructorDao;
		this.loggers=loggers;	
	}
	
	public void add(Instructor żnstructor)
	{
		System.out.println(żnstructor.getFullName());
		żnstructorDao.add(żnstructor);
		

		 for(Logger logger:loggers) {
			   
			   logger.log(żnstructor.getFullName());
			   	   
		   }

		
	}
	
	
	
	
}
