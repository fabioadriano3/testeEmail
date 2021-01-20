package Cadstro_de_Email;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;


import java.util.concurrent.TimeUnit;

public class RunTeste {


    Driver driver;

    @Rule
    public TestName evidencia = new TestName();

    @Before
    public void setUp() {
        driver = new Driver();

        //   browser.getDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }


    @Test

    public void test1() {

        driver.getDriver().get("https://outlook.live.com/owa/");

        driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

      driver.getDriver().findElement(By.xpath("/html/body/header/div/div/div[2]/div/div/div/a/span")).click();


      driver.getDriver().findElement(By.xpath("//*[@id=\"MemberName\"]")).sendKeys("fabiotest1teste5");
      driver.getDriver().findElement(By.xpath("//*[@id=\"iSignupAction\"]")).click();

      //mostrar senha
        driver.getDriver().findElement(By.xpath("//*[@id=\"ShowHidePasswordCheckbox\"]")).click();


      //criando a senha
        driver.getDriver().findElement(By.xpath("//*[@id=\"PasswordInput\"]")).sendKeys("fabio1234");
        Print.tirar(driver.getDriver(),"C:\\Users\\fabio.silva\\Desktop\\cadastrodeemail\\evidencias\\"+ DataHora.dataHoraArquivo()+"_"+evidencia.getMethodName()+".png");




        //gerando o email
        driver.getDriver().findElement(By.xpath("//*[@id=\"iSignupAction\"]")).click();
        Print.tirar(driver.getDriver(),"C:\\Users\\fabio.silva\\Desktop\\cadastrodeemail\\evidencias\\"+ DataHora.dataHoraArquivo()+"_"+evidencia.getMethodName()+".png");

        //nome do usuario
        driver.getDriver().findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Fabio");
        driver.getDriver().findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Adriano");

        //salvando
        driver.getDriver().findElement(By.xpath("//*[@id=\"iSignupAction\"]")).click();
        //data nascimento
        driver.getDriver().findElement(By.xpath("//*[@id=\"BirthDay\"]/option[4]")).click();
        driver.getDriver().findElement(By.xpath("//*[@id=\"BirthMonth\"]/option[3]")).click();
        driver.getDriver().findElement(By.xpath("//*[@id=\"BirthYear\"]/option[19]")).click();
        driver.getDriver().findElement(By.xpath("//*[@id=\"iSignupAction\"]")).click();
        driver.getDriver().manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        Print.tirar(driver.getDriver(),"C:\\Users\\fabio.silva\\Desktop\\cadastrodeemail\\evidencias\\"+ DataHora.dataHoraArquivo()+"_"+evidencia.getMethodName()+".png");
        driver.getDriver().findElement(By.xpath("//*[@id=\"iDeviceFingerPrinting\"]")).click();
      //  print.tirar(driver.getDriver(),"C:\\Users\\fabio.silva\\Desktop\\cadastrodeemail\\evidencias\\"+ datahora.dataHoraArquivo()+"_"+evidencia.getMethodName()+".png");


    }
}