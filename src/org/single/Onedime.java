package org.single;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Onedime {
	int a[]=new int[3];
	a[0]=100;
	a[1]=200;
	a[2]=300;
	int jeeva() {//input[@name='mobile']

	}
	//input[@ng-model='FirstName']
	WebElement use=t1.findElement(By.xpath("//input[@title='From station']"));
	use.sendKeys("Panruti");
	
	WebElement user=t1.findElement(By.xpath("//input[@name='lastName']"));
	user.sendKeys("Paranthaman");
	
	WebElement pwd=t1.findElement(By.xpath("//input[@minlength='3']"));
	pwd.sendKeys("jayasln132@gmail.com");
}
