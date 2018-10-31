package SoftEng.Assignment1.PartB;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;


import SoftEng.Assignment1.mavenproject1.CourseProgramme;


import SoftEng.Assignment1.mavenproject1.Module;
import SoftEng.Assignment1.mavenproject1.Student;

//@Eoghan Hennelly

public class StudentRegTest {
	
	

public static void main(String args[]) throws ParseException {
		
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date date1 = dateformat.parse("12/12/1994");
		Student lilly = new Student("Lilly", date1, 4352);
		
		Date date2 = dateformat.parse("13/3/1996");
		Student david = new Student("David", date2, 4351);
		
		Date date3 = dateformat.parse("1/1/1994");
		Student michelle = new Student("Michelle", date3, 4353);
		
		Date date4 = dateformat.parse("25/9/1995");
		Student johnny = new Student("Johnny", date4, 4354);
		
		Date date5 = dateformat.parse("8/8/1998");
		Student megan = new Student("Megan", date5, 4355);
		
		Date date6 = dateformat.parse("11/5/1995");
		Student alan = new Student("Alan", date6, 4356);
		
		
		Student[] students1 = new Student[3];
		students1[0] = lilly;
		students1[1] = david;
		students1[2] = michelle;
		Module softEng = new Module("Software Eng", "CT417", students1);
		
		Student[] students2 = new Student[3];
		students2[0] = lilly;
		students2[1] = david;
		students2[2] = michelle;
		Module dataSys = new Module("Database Systems", "CT230", students2);
		
		Student[] students3 = new Student[3];
		students3[0] = johnny;
		students3[1] = megan;
		students3[2] = alan;
		Module proSkil = new Module("Pro Skills", "CT404", students3);
		
		Student[] students4 = new Student[3];
		students4[0] = johnny;
		students4[1] = megan;
		students4[2] = alan;
		Module realTim = new Module("Real Time Systems", "EE420", students4);
		
		
		Module[] modules1 = new Module[2];
		modules1[0] = softEng;
		modules1[1] = dataSys;
		DateTime start1 = new DateTime(25/8/2017);
		DateTime end1 = new DateTime(9/5/2021);
		CourseProgramme comSci = new CourseProgramme("Computer Science", modules1, start1, end1);
		
		Module[] modules2 = new Module[2];
		modules2[0] = proSkil;
		modules2[1] = realTim;
		DateTime start2 = new DateTime(25/8/2016);
		DateTime end2 = new DateTime(9/5/2020);
		CourseProgramme eleCom = new CourseProgramme("Electronic Engineering", modules2, start2, end2);
		
		CourseProgramme[] courses = new CourseProgramme[2];
		courses[0] = comSci;
		courses[1] = eleCom;
		
		for(int i = 0; i < courses.length; i++) {
			
			System.out.println("Course name:" + courses[i].getName() + "\n");
			Module[] modules = courses[i].getModules();
			
			for(int j = 0; j < modules.length; j++) {
				
				System.out.println("\tModule name:\t" + modules[j].getName() + "\n");
				Student[] students = modules[j].getStudents();
				
				for(int k = 0; k < students.length; k++) {
					
					System.out.println("\t\tStudent username:\t\t" + students[k].getUsername() + "\n");
					
				}
			}
		}
		
	}

}
