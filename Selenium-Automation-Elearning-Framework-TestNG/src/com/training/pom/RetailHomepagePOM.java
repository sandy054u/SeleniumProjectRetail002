package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RetailHomepagePOM {

	private WebDriver driver;

	public RetailHomepagePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(By.xpath("//i[@class='fa fa-user-o']")) private WebElement account; 
	
	@FindBy(xpath="//i[@class='fa fa-user-o']")	private WebElement acc_icon; 
	
//	By acc_icon = By.xpath("//i[@class='fa fa-user-o']"); 
	
	//Locator of Best Seller section
	@FindBy (xpath = "//h2[contains(text(),'Best Sellers')]") public WebElement bestsellersection;
	
	//Locator of the Product in the Best Seller Section
	@FindBy(xpath ="//div[@class='swiper-slide swiper-slide-duplicate']//div[@class='tb_size_5_last tb_size_6_last tb_size_7_last tb_size_8_last tb_size_9_last tb_size_10_last tb_size_11_last tb_size_12_last']//div[@class='product-thumb product-thumb_style1']//div[@class='thumbnail']//div[@class='image']//a//span//span//img[contains(@class,'lazyloaded')]") public WebElement prodquickviewbtn;
 
	

	public void clickAccountIcon() throws InterruptedException {
		//driver.findElement(acc_icon).click();
		this.acc_icon.click();
		Thread.sleep(3000);
		System.out.println("clicked on Register button");
		System.out.println("The current page title is :" +  driver.getTitle());
	}
	
	public void clickProduct() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[5]//div[1]//div[1]//div[2]//div[1]//div[2]//a[1]//img[1]")));
		Thread.sleep(5000);
		this.prodquickviewbtn.click();
	}
}