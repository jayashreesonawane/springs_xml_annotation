package doctor;

import org.springframework.stereotype.Component;

@Component
public class Cardiologist implements Doctor{
	public void specialization() {
		System.out.println("Cardiologist doctor who treats Heart");
	}
}
