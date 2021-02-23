package ua.kyiv.springJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.kyiv.springJPA.domain.University;
import ua.kyiv.springJPA.service.UniversityDataService;
import ua.kyiv.springJPA.service.impl.UniversityDataServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		UniversityDataService universityService = ctx.getBean(UniversityDataServiceImpl.class);
		
		//create
		for(int i = 1; i <= 4; i++) {
			University university = new University();
			university.setName("university-" + i);
			university.setAccreditationLevel(i);
			university.setInstitutesCount(i*10);
			university.setStudentsCount(i*1000);
			university.setAddress("Some address " + i);
			universityService.create(university);
		}
		
		//find By Accreditation Level
		System.out.println(universityService.findByAccreditationLevel(3));
		
		//find By Institutes Count
		System.out.println(universityService.findByInstitutesCount(20));
		
		//find By Students Count Greater Than
		System.out.println(universityService.findByStudentsCountGreaterThan(2500));
		
		//find By Name
		System.out.println(universityService.findByName("university-4"));
		
		//read By id
		System.out.println(universityService.readById((long) 1));
		
		//read All
		System.out.println(universityService.readAll());
		
		//delete By Id
		universityService.deleteById((long)2);
	}
}
