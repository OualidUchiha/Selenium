package com.selenium.ProjetSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciceAjouterSupprimer {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//ajout
		for(int pas=1;pas<=5;pas++) {
			driver.findElement(By.tagName("button")).click();
		}
		Thread.sleep(3000);
		//supression
		for(int pas=1;pas<=3;pas++) {
			driver.findElement(By.className("added-manually")).click();
			Thread.sleep(3000);
		}
		
		driver.quit();
	}

}
