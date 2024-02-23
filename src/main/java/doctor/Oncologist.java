package doctor;

import org.springframework.stereotype.Component;

@Component
public class Oncologist implements Doctor{
	public void specialization() {
		System.out.println("Oncologist doctor who treats Cancer");
	}
}
