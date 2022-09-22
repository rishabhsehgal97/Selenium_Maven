package pages;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


	
	public class LoginPage {
		WebDriver driver;
		
		
		@FindBy(linkText="Log in")
		WebElement LoginLink;
		@FindBy(name="user_login")
		WebElement Username;
		@FindBy(id="password")
		WebElement Password;
		@FindBy(className="rememberMe")
		WebElement Checkbox;
		@FindBy(name="btn_login")
		WebElement LoginButton;
		
		public LoginPage(WebDriver basedriver) {
			this.driver=basedriver;
			PageFactory.initElements(basedriver, this);	
	}

		public void login(String UsernameVal, String PassVal) {
	//-------------Methods----------	
			LoginLink.click();
			Username.sendKeys(UsernameVal);
			Password.sendKeys(PassVal);
			Checkbox.click();
			LoginButton.click();
	}
	}