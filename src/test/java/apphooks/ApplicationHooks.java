package apphooks;

import java.io.IOException;

import org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument.Import;

import com.utility.Utility;
import com.aventstack.extentreports.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks extends Utility{
	
	
	@Before()
	public void launchBrowser() throws IOException{
		
		Utility.launchingBrowser();
		Utility.browserMaximize();
		Utility.launchingApp(url);
		
	}
	
	@After()
	public void quitBrowser() throws IOException {

		Utility.closingBrowser();
		
		//for generate report
		report.flush();
	}
	
}