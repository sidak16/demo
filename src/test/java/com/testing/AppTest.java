package com.testing;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class AppTest 
{
    
	static ExtentReports report;  //used to generate the path of the report
	static ExtentTest test;//used to log test steps in the generated report
	
	@BeforeClass
	public static void startTest()
	
	{
		 report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		 test = report.startTest("ExtentDemo");
	
	}
	
	
	
    App app = new App();
    
    @Test
    public void testSum(){
        int expected = 30;
        int actual = app.sum(10, 20);
      Assert.assertEquals(actual,expected);
       
      {
          test.log(LogStatus.PASS, "Expected result is same as actual result");
      }
      
     
         
    }
    
@AfterClass
	
	public static void endTest()
	
	{
	
	report.endTest(test);
    report.flush();
	
	}
}
