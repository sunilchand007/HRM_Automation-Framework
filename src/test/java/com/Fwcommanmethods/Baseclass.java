package com.Fwcommanmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Baseclass {
	
	public static WebDriver driver;
	public static void getbrowser(String browser) {
		
		try {
			if (browser.equals("chrome")){
					System.setProperty("webdriver.chrome.driver", "C:\\sunilselenium\\sel mavenproject\\Hrmproject\\Browserdrivers\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://www.amazon.com/sign-in");
					}
				else if(browser.equals("Firefox")){
					System.setProperty("Webdriver.Gecko.driver", "C:\\sunilselenium\\sel mavenproject\\Hrmproject\\Browserdrivers\\geckodriver.exe");
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
					driver.get("https://www.amazon.in//");
				}
				else if(browser.equals("IE")){
					System.setProperty("Webdriver.ie.driver", "C:\\sunilselenium\\sel mavenproject\\Hrmproject\\Browserdrivers\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
					driver.manage().window().maximize();
					driver.get("https://www.amazon.in//");
				}
				else {
					System.out.println("browsers are not available");
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("browseris not opened:"+e.getMessage());
		}

			}
		
		
	

}
