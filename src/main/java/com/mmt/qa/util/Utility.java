package com.mmt.qa.util;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

public static int pageload_timeout= 10;
public static int implecit_wait= 10;

public static void takeSnapShot(WebDriver driver,String fileWithPath) {

    //Convert web driver object to TakeScreenshot
try{	
    TakesScreenshot scrShot =((TakesScreenshot)driver); 	

    //Call getScreenshotAs method to create image file

            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

            File DestFile=new File(fileWithPath);

            //Copy file at destination

            FileUtils.copyFile(SrcFile, DestFile);
}
catch (Exception e) {
	
	e.printStackTrace();
}

}
	
	
	
	
	
}
