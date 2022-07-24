
  package com.example.healthcare;
  
  
  import org.openqa.selenium.By;
import
  org.openqa.selenium.WebDriver;
import
  org.openqa.selenium.chrome.ChromeDriver;
import
  org.testng.annotations.Test;
  
  public class CapstoneprojectMedicareApplicationTests {
  
  @Test public void UserLoginTest() throws InterruptedException {
  
  System.setProperty("webdriver.chrome.driver",
  "C:\\Users\\hemas\\Downloads\\chromedriver_win32\\chromedriver.exe");
  
  Thread.sleep(5000); WebDriver wd=new ChromeDriver(); System.out.println(wd);
  wd.manage().window().maximize();
  
  
  wd.get("http://localhost:8080/login.html");
  
  wd.findElement(By.name("username")).sendKeys("user1"); Thread.sleep(2000);
  wd.findElement(By.name("password")).sendKeys("password");
  wd.findElement(By.name("submit")).submit();
  
  //close the browser wd.close();
  
  }
  
  @Test public void AdminLoginTest() throws InterruptedException {
  
  System.setProperty("webdriver.chrome.driver",
  "C:\\Users\\hemas\\Downloads\\chromedriver_win32\\chromedriver.exe");
  
  WebDriver wd=new ChromeDriver(); System.out.println(wd);
  wd.manage().window().maximize();
  
  
  wd.get("http://localhost:8080/login.html");
  
  wd.findElement(By.name("username")).sendKeys("admin1"); Thread.sleep(2000);
  wd.findElement(By.name("password")).sendKeys("admin1");
  wd.findElement(By.name("submit")).submit();
  
  //close the browser wd.close();
  
  } }
 