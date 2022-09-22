package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.LoginPage;

public class SimplilearnLogin extends BaseClass {
	
	
	@Test
	public void test1() {
		test.log(LogStatus.INFO, "test1 Started");
		
		LoginPage lp=new LoginPage(driver);
				lp.login("rishabhsehgal97@gamil.com", "Abc@1234");
		WebElement Error=driver.findElement(By.id("msg_box"));
		String ActError=Error.getText();
		String ExpError= "The email or password you have entered is invalid.";
		Assert.assertEquals(ActError, ExpError);
	}
	
		@Test
		@Parameters({"uname", "pwd"})
		public void test2(String UserName, String Password) {
			test.log(LogStatus.INFO, "test2 Started");
			LoginPage lp1=new LoginPage(driver);
			lp1.login(UserName, Password);
			
			
		}
		@Test
		public void test3() {
			test.log(LogStatus.INFO, "test3 Started");
			String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
	        String Password = sheet.getRow(1).getCell(1).getStringCellValue();
	        LoginPage lp1=new LoginPage(driver);
			lp1.login(UserName, Password);
		
	
		
				
	}
}