package com.pages;

import java.util.Iterator;
import java.util.Set;

import com.utility.Utility;

public class StoreLocatorPage extends Utility{
	public static void WindowHandles() {
		 String mainWindowHandle = driver.getWindowHandle();
       Set<String> handles = driver.getWindowHandles();
       Iterator<String> it = handles.iterator();
       String parentId = (String) it.next();
       String childId = (String) it.next();
       driver.switchTo().window(childId);
	}
	
	//Getting other page title
		public String validateStoreLocatorPageTitle() {
	        StoreLocatorPage.WindowHandles();
			return validatePageTitle();
	    }
}
