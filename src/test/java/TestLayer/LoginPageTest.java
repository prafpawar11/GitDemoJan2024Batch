package TestLayer;

import PageLayer.HomePage;
import PageLayer.LoginPage;
import PageLayer.PIMPage;

public class LoginPageTest {

	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		login.loginFunctionality();
	
		HomePage homePage =new HomePage();
		homePage.getTitle();
<<<<<<< HEAD
		
		PIMPage pIMPage =new PIMPage();
		pIMPage.getUrl();
=======
		homePage.geturl();
>>>>>>> 063e1d2eee39d11a5c3ead0c22516c2306c21489
	}
}
