package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.Utils;
public class HumanaHomePage extends BaseClass{
    private static WebElement element = null;
   
public HumanaHomePage(WebDriver driver){
    	super(driver);
}    
public static WebElement footerLogo() throws Exception{
    try{ 
    	// element = driver.findElement(By.xpath("//*[@alt='Humana']"));
    	 element = driver.findElement(By.className("page-footer-v2"));
    	 
    	 Utils.mouseHoverAction1(element);
    		 Log.info("Humana Footer link is found on the Home Page");
    		 
    }catch (Exception e){
   		Log.error("Humana Footer link is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement footerElement1() throws Exception{
    try{ 
    	
    	element = driver.findElement(By.className("page-footer-v2"));
    	Utils.mouseHoverAction1(element);
    	element = driver.findElement(By.linkText("Individual"));
    	
    	String link1 = element.getText();
    	if(link1.contains("Individual Insurance"))
    	{
    		Log.info("Individual Insurance link is found on the Home Page");
    	}
    	
    		 
    		 
    }catch (Exception e){
   		Log.error("Individual Insurance link is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}
/*
public static WebElement footerLogo() throws Exception{
    try{ 
    	// element = driver.findElement(By.xpath("//*[@alt='Humana']"));
    	 element = driver.findElement(By.className("page-footer-v2"));
    	 
    	 Utils.mouseHoverAction1(element);
    		 Log.info("Humana Footer link is found on the Home Page");
    		 
    }catch (Exception e){
   		Log.error("Humana image link is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement footerLogo() throws Exception{
    try{ 
    	// element = driver.findElement(By.xpath("//*[@alt='Humana']"));
    	 element = driver.findElement(By.className("page-footer-v2"));
    	 
    	 Utils.mouseHoverAction1(element);
    		 Log.info("Humana Footer link is found on the Home Page");
    		 
    }catch (Exception e){
   		Log.error("Humana image link is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement footerLogo() throws Exception{
    try{ 
    	// element = driver.findElement(By.xpath("//*[@alt='Humana']"));
    	 element = driver.findElement(By.className("page-footer-v2"));
    	 
    	 Utils.mouseHoverAction1(element);
    		 Log.info("Humana Footer link is found on the Home Page");
    		 
    }catch (Exception e){
   		Log.error("Humana image link is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static WebElement footerLogo() throws Exception{
    try{ 
    	// element = driver.findElement(By.xpath("//*[@alt='Humana']"));
    	 element = driver.findElement(By.className("page-footer-v2"));
    	 
    	 Utils.mouseHoverAction1(element);
    		 Log.info("Humana Footer link is found on the Home Page");
    		 
    }catch (Exception e){
   		Log.error("Humana image link is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

Utils.mouseHoverAction1(element, "Humana");
Log.info("Humana Footer link is found on the Home Page");
*/

public static WebElement lnk_LogOut() throws Exception{
    try{
    	element = driver.findElement(By.id("account_logout"));
    
        Log.info("Log Out link is found on the Home Page");
    }catch (Exception e){
    	Log.error("Log Out link is not found on the Home Page");
   		throw(e);
   		}
   	return element;
}

public static class TopNavigation{
	
	public static class Product_Type{
		
			static WebElement mainElement;
		
		public static void Accessories() throws Exception{
			try{
    			mainElement = driver.findElement(By.linkText("Product Category"));
    			Log.info("Product category link is found under Top Navigation");
    			Utils.mouseHoverAction(mainElement, "Accessories");
			}catch (Exception e){
				Log.error("Accessories link is not found under Product Category");
				throw(e);
			}
           }
		
		public static void iMacs() throws Exception{
			try{
    			mainElement = driver.findElement(By.linkText("Product Category"));
    			Log.info("Product category link is found under Top Navigation");
    			Utils.mouseHoverAction(mainElement, "iMacs");
			}catch (Exception e){
				Log.error("Accessories link is not found under Product Category");
				throw(e);
			}
           }
		
		public static void iPads() throws Exception{
			try{
    			mainElement = driver.findElement(By.linkText("Product Category"));
    			Log.info("Product category link is found under Top Navigation");
    			Utils.mouseHoverAction(mainElement, "iPads");
			}catch (Exception e){
				Log.error("Accessories link is not found under Product Category");
				throw(e);
			}
           }
		
		public static void iPhones() throws Exception{
			try{
    			mainElement = driver.findElement(By.linkText("Product Category"));
    			Log.info("Product category link is found under Top Navigation");
    			Utils.mouseHoverAction(mainElement, "iPhones");
			}catch (Exception e){
				Log.error("Accessories link is not found under Product Category");
				throw(e);
			}
           }
		
	}
	
}



}