package business;

import core.Logger;
import dataAccsess.InstructorDao;
import entities.Instructor;

public class InstructorManager {

	private InstructorDao �nstructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao �nstructorDao, Logger[] loggers) {
		
		this.�nstructorDao=�nstructorDao;
		this.loggers=loggers;	
	}
	
	public void add(Instructor �nstructor)
	{
		System.out.println(�nstructor.getFullName());
		�nstructorDao.add(�nstructor);
		

		 for(Logger logger:loggers) {
			   
			   logger.log(�nstructor.getFullName());
			   	   
		   }

		
	}
	
	
	
	
}
