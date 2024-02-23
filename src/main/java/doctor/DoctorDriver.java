package doctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DoctorDriver {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("doctor.xml");
		Orthopedic orthopedic = applicationContext.getBean("orthopedic",Orthopedic.class);
		orthopedic.specialization();
		System.out.println(orthopedic.getFees());
		Cardiologist cardiologist = applicationContext.getBean("cardiologist",Cardiologist.class);
		cardiologist.specialization();
		Oncologist oncologist = applicationContext.getBean("oncologist",Oncologist.class);
		oncologist.specialization();

	}
}
