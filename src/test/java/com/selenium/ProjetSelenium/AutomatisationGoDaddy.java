package com.selenium.ProjetSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AutomatisationGoDaddy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.godaddy.com/fr-ca");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		/*récuperer le titre de la page à partir du dom au niveau de l'objet qui porte la balise <title>*/
		String titrePageAttendu="Noms de domaine, sites Web, hébergement et outils de cybermarketing : GoDaddy CA";
		/*Récupérer la valeur actuelle du titre de la page avec driver.getTitle()*/
		Assert.assertEquals(titrePageAttendu, driver.getTitle());
		/*récuperer l'url de la page actuel*/
		String urlActuelle=driver.getCurrentUrl();
		String urlAttendu="https://www.godaddy.com/fr-ca";
		Assert.assertEquals(urlAttendu, urlActuelle);
		/*recuperer la source de la page*/
		Thread.sleep(5000);
		/*
		String sourcePageWeb=driver.getPageSource();
		System.out.println(sourcePageWeb);
		Assert.assertTrue(sourcePageWeb.contains(titrePageAttendu));
		*/
		Thread.sleep(3000);
		driver.findElement(By.className("fqpukcf")).click();
		Thread.sleep(3000);
		/*cliquer sur Recherche de nom de domaine*/
		driver.quit();
	}

}
