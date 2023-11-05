package com.selenium.ProjetSelenium;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExoSelenium {

	public static void main(String[] args) throws InterruptedException, IOException {
		/*création du driver*/
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	/*temps de chargement de la page de connexion*/
	Thread.sleep(3000);
	/*saisir username et mot de passe (connexion)*/
	//-1 : saisir mot de passe 
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(3000);
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(3000);
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(5000);
	/*Chercher un produit pour le mettre dans un panier*/
	driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	Thread.sleep(5000);
	driver.findElement(By.className("shopping_cart_badge")).click();
	Thread.sleep(5000);
	/*Capturez l'ecran du produit selectionné*/
	File capture1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	Path destination1=Path.of("D:\\WorkSpace\\ProjetSelenium\\capture.png");
	Files.copy(capture1.toPath(),destination1,StandardCopyOption.REPLACE_EXISTING);
	Thread.sleep(3000);
	driver.quit();
	// test commit 1
	}
}
