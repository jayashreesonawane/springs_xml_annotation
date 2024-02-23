package doctor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Orthopedic implements Doctor{
	
	@Value("3574920")
	public double fees;
	
	
	public double getFees() {
		return fees;
	}


	public void setFees(double fees) {
		this.fees = fees;
	}


	public void specialization() {
		System.out.println("Orthopedic doctor who treats Bones");
	}
}
