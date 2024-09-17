package day43;

import org.testng.annotations.Test;

public class LoginMethods {

	@Test(priority=1,groups= {"sanity"})
	void liginbyEmail() {
		System.out.println("This is Login by Email...");
	}

	@Test(priority=2,groups= {"sanity"})
	void loginbyFacebook() {
		System.out.println("This is logion by Facebook...");
	}

	@Test(priority=3,groups= {"sanity"})
	void loginbyTwitter() {
		System.out.println("This is login by Twitter....");
	}

}
