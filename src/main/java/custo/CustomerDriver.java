package custo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerDriver {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("customer.xml");
		Customer customer = applicationContext.getBean("customer", Customer.class);
//		System.out.println("Customer Name is " + customer.getName());
//		System.out.println("Phone Number : " + customer.getPhone());
//		System.out.println("Address = " + customer.getAddress());
		System.out.println(customer.name);
		System.out.println(customer.address);
		System.out.println(customer.phone);
	}
}
