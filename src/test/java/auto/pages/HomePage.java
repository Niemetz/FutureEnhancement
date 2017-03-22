package auto.pages;

import net.thucydides.core.annotations.DefaultUrl;

 @DefaultUrl("https://www.amazon.com") 

public class HomePage extends AmazonBasePageObject 
{
		public HomePage()
		{
			super() ;
			mapTable.clear();
			mapTable.put("Sign in securely".toLowerCase(),"#a-autoid-0-announce");
			mapTable.put("Account & Lists".toLowerCase(),".//*[@id='nav-link-accountList']/span[2]");
			mapTable.put("Page Unique Element".toLowerCase(), "#a-autoid-0-announce");	
			// Update #3 by John to Remote Development Branch....
		}
}