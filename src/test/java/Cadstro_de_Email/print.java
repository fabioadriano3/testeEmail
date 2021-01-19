package Cadstro_de_Email ;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class print {

            public static void tirar (WebDriver driver, String arquivo){
            File destino = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try{
                FileUtils.copyFile(destino,new File(arquivo));
            } catch (Exception e){
                System.out.println("errro" + e.getMessage());

            }



        }

    }


