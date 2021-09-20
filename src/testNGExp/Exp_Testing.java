package testNGExp;

import org.testng.annotations.Test;

public class Exp_Testing {
@ Test //one @Test is equal to 1 test case / scenario
public void login() {
	System.out.println("login completed");
}
@Test
public void logout() {
	System.out.println("logout completed");
}
@Test
public void addEmployee() {
	System.out.println("Add");
}
@Test
public void delemp()
{
	System.out.println("del");
	}
}
