package day21;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {
       ChromeDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.navigate().to("https://www.orangehrm.com/");
       driver.navigate().back();
       driver.navigate().refresh();
       driver.navigate().forward();
       
       Set<String> windowid= driver.getWindowHandles();
       
       List<String> windowlist=new ArrayList();
       String parentid=windowlist.get(0);
       String childid=windowlist.get(1);     
       
       
	 	
	}

}
