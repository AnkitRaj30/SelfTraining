package webDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exp_WT {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.gecko.driver","D:\\\\Eclipse\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("file:///D:/Internship%20project%202020/Software%20Testing%20(Selenium)/HtmlFiles/WebTable.html");
		//int row = driver.findElements(By.xpath("/html/body/table/tbody/tr[7]/td[4]")).size();
		int row = driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		int col = driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/td")).size();
		int row_col = driver.findElements(By.xpath("/html/body/table/tbody/tr/td")).size();
			System.out.println(row);
			System.out.println(col);
			System.out.println(row_col);
       //Data 
			String Cell = driver.findElement(By.xpath("/html/body/table/tbody/tr[7]/td[3]")).getText();
			System.out.println(Cell);
		//Whole Data
		for(int i=1;i<=row;i++){
			String Data = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]")).getText();
			System.out.println(Data);
			Thread.sleep(3000);
			
		}   
		driver.close();
			}
}
