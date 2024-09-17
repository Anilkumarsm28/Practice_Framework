package day43;

import org.testng.annotations.Test;

public class DependencyMethods {

	@Test(priority=1,groups= {"sanity","regression"})
	void paymentinRuppes() {
		System.out.println("payment in rupees...");
	}
	@Test(priority=2,groups= {"sanity","regression"})
	void paymentinDollors() {
		System.out.println("payment in Dollors....");
	}
}
