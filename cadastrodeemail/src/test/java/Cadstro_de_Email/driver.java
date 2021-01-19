package Cadstro_de_Email;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

class Driver {

       private WebDriver driver ;

 public Driver (){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\fabio.silva\\Desktop\\chromedriver.exe");
            this.driver = new ChromeDriver();

        }

        public WebDriver getDriver(){
            return this.driver;
        }}