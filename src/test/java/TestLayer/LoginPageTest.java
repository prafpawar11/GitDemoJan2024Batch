package TestLayer;

import PageLayer.HomePage;
import PageLayer.LoginPage;

public class LoginPageTest {

	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		login.loginFunctionality();
	
		HomePage homePage =new HomePage();
		homePage.getTitle();
		homePage.geturl();
	}
}
