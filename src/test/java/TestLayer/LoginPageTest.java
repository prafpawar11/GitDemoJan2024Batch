package TestLayer;

import PageLayer.AdminPage;
import PageLayer.HomePage;
import PageLayer.LoginPage;
import PageLayer.PIMPage;

public class LoginPageTest {

	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		login.loginFunctionality();

		HomePage homePage = new HomePage();
		homePage.getTitle();

		PIMPage pIMPage = new PIMPage();
		pIMPage.getUrl();
		
		AdminPage adminPage =new AdminPage();
		adminPage.adminUrl();
	}
}
