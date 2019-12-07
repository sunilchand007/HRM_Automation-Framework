package com.webcommanmethods;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Fwcommanmethods.Baseclass;



public class WebReusability extends Baseclass {
	public static void getmousehover(String Elementpath) {
		WebElement element = driver.findElement(By.xpath(Elementpath));
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

}
