package com.makemytrip;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Booking {

	public static WebDriver driver; 
	public  Actions action;
	public void LoginAppication() throws Exception {
		
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[6]")).click();
	       
        System.out.println("click1");
        Thread.sleep(3000);

        driver.findElement(By.id("username")).sendKeys("ramesh.sulthan1991@gmail.com");
        
        driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")).click();
        
        System.out.println("username");
        
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();	
        
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ramesh@1122");
        driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")).click();
        System.out.println("Login");
        Thread.sleep(3000);
        
	}
	public void HotelBook() {
		
		    driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[2]/a/span[2]")).click();
  	        Select st = new Select(driver.findElement(By.xpath("//*[@id=\"city\"]"))); 
	        st.selectByIndex(2);
	}
	public void CheckInOut() {
		
	      driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[6]")).click();
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[2]")).click();
	      driver.findElement(By.id("//*[@id=\"guest\"]")).click();
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[4]/div[1]/div[1]/div/div[2]/div/ul[1]/li[2]")).click();
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[4]/div[1]/div[1]/div/div[2]/div/ul[2]/li[1]")).click();
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[4]/div[1]/div[2]/button[2]")).click();
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[5]/label/span")).click();
	      Select st1 = new Select( driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[5]/ul/li[1]")));
	      st1.deselectByIndex(0);
	     driver.findElement(By.xpath("//*[@id=\"hsw_search_button\"]")).click();
	}   
	
	public void SelectFilters() {
		driver.findElement(By.xpath("//*[@id=\"hlistpg_fr_preferred_filters\"]/ul/li[2]/span[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"hlistpg_fr_popular_filters\"]/ul/li[3]/span/label")).click();
	}
	
	
		
	public void move(boolean isRight, int noofMoves,WebDriver driver) {
				action = new Actions(driver);
		     if(isRight) {
		    	 for(int i=0;i<noofMoves;i++) {
		    		 action.sendKeys(Keys.ARROW_RIGHT).build().perform();
		    	 }
		     }
		     else {
		    	 for(int i=0;i<noofMoves;i++) {
		    		 action.sendKeys(Keys.ARROW_LEFT).build().perform();
		    	 }
		     }
		     WebElement leftslider = driver.findElement(By.xpath("//*[@id=\\\"hlistpg_fr_price_per_night\\\"]/div[2]/div[2]/div/span[1]/div"));
	            leftslider.click();
	           // AppTest test = new AppTest();
	          //  test.move(true, 5, driver);
			}
	
	
   public void Locality() {
	   driver.findElement(By.xpath("//*[@id=\"hlistpg_fr_locality\"]/div/div[2]/ul/li[2]/span/label")).click();
	   driver.findElement(By.xpath("//*[@id=\"hlistpg_fr_star_category\"]/ul/li[3]/span[1]/label")).click();
   }
   public void selectHotel() {
	   driver.findElement(By.xpath("//*[@id=\"Listing_hotel_1\"]/a/div/div[1]/div[2]")).click();
	   
   }
   public void BookThisNow() {
	   driver.findElement(By.xpath("//*[@id=\"detpg_headerright_book_now\"]")).click();
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/a")).click();
	   
   }
   public void TravellerInformation() {
	   Select st2 = new Select(driver.findElement(By.xpath("//*[@id=\"title\"]")));
	   st2.selectByIndex(0);
	   driver.findElement(By.id("fName")).sendKeys("Ramesh");
	   driver.findElement(By.id("lName")).sendKeys("Sultanollu");
	   driver.findElement(By.id("pan")).sendKeys("");
	   driver.findElement(By.xpath("//*[@id=\"revpg_available_deals\"]/div[1]")).click();
	   
	   
   }
   public void PayNow() {
	   driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"NB\"]/span[2]")).click();
   }

public void close() {
	driver.close();
}
   public static void main(String args[]) throws Exception {
	   
			try {
			System.setProperty("webdriver.chrome.driver", "src\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.makemytrip.com/");
			} catch (Exception e) {
	            e.printStackTrace();
	           }
		      
     Booking b = new Booking();
     b.LoginAppication();
     b.HotelBook();
     b.CheckInOut();
     b.SelectFilters();
     b.move(true, 5, driver);
     b.Locality();
     b.selectHotel();
     b.BookThisNow();
     b.TravellerInformation();
     b.PayNow();
     b.close();
   
   }
   }


