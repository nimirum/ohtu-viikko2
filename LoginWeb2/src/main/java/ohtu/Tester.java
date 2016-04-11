package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Tester {
    public static void main(String[] args) {
        WebDriver driver = new HtmlUnitDriver();

        driver.get("http://localhost:8090");
        WebElement element = driver.findElement(By.linkText("login"));       
        element.click(); 
        
        System.out.println("==");
        
        System.out.println( driver.getPageSource() );
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("login"));
        element.submit();
        
        //logout to login page
        element = driver.findElement(By.linkText("logout"));
        element.click();
        element = driver.findElement(By.linkText("login"));
        element.click();
        
        //wrong password
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("pekkaa");
        element = driver.findElement(By.name("login"));
        element.submit();
        
        System.out.println("Wrong password: " + driver.getPageSource().contains("wrong username or password"));
        
        //wrong username
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekkapuupää");
        element = driver.findElement(By.name("password"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("login"));
        element.submit();
        

        System.out.println("Wrong username: " + driver.getPageSource().contains("wrong username or password"));
   
        //back to home page, then register new user page
        element = driver.findElement(By.linkText("back to home"));
        element.click();
        element = driver.findElement(By.linkText("register new user"));
        element.click();
        
        element = driver.findElement(By.name("username"));
        element.sendKeys("panuu");
        element = driver.findElement(By.name("password"));
        element.sendKeys("k4Ky65fx");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("k4Ky65fx");
        element = driver.findElement(By.name("add"));
        element.submit();
        
        System.out.println("A new user was created: " + driver.getPageSource().contains("info for newbie"));
        
        element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();
        
        element = driver.findElement(By.linkText("logout"));
        element.click();

        System.out.println("Logging out: " + driver.getPageSource().contains("login"));
    }
}
