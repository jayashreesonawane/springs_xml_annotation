package springs_xml_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDriver {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("user.xml");
//		User user = applicationContext.getBean("user",User.class);
//		user.info();
		Student student = applicationContext.getBean("student",Student.class);
		student.info();
		
	}
}
