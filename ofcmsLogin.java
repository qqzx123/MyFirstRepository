package com.woniu.test;



import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ofcmsLogin {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.bin","D:\\FireFox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver","D:\\FireFox\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/ofcms-admin/admin/login.html");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("12212121");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".layui-btn")).click();
		Thread.sleep(500);
		System.out.println("111");
		//classname定位不能直接用复合class，可以任选其中一个唯一的classname进行定位
		//String text = driver.findElement(By.className("layui-layer-content")).getText();
		//同时也可以将复合class转化成css（在前面加一个点，并将空格替换为点）
		String text = driver.findElement(By.cssSelector(".layui-layer-content.layui-layer-padding")).getAttribute("textContent");
		//driver.findElement(By.className("layui-layer-content layui-layer-padding"));
		System.out.println("222");
		System.out.println(text);
		if(text.equals("登录密码错误")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		
//		WebElement element=driver.findElement(By.className("layui-layer-content layui-layer-padding"));
//		boolean ep = isElementPresent(element);
//		System.out.println(ep);
//		if(ep==true) {
//			String text = element.getText();
//			System.out.println(text);
//		}else {
//			System.out.println("元素没找到");
//		}
		
		
	}
	
//	public static boolean isElementPresent(WebElement element) {
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		if(element!=null){		
//			return true;
//		}else {
//			return false;
//		}
			
	//}
	
	
	
}
