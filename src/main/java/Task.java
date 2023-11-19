import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Task {

public WebDriver driver;

private static String HEADER="//a[text()='Challenging DOM']";
private static String BUTTON_BLUEBAR="//a[@class='button']";

private static String BUTTON_REDBAR="//a[@class='button alert']";

private static String BUTTON_GREENBAR="//a[@class='button success']";
public Task(WebDriver driver) {
        this.driver = driver;
    }


    public void ClickOnMenu(){

    WebElement clickOnMenu= driver.findElement(By.xpath(HEADER));
    clickOnMenu.click();
  }

    public String TestCheckButton()
    {
    String getcolorOnBlueBar=driver.findElement(By.xpath(BUTTON_BLUEBAR)).getCssValue("background-color");
    return getcolorOnBlueBar;
    }

    public String TestcheckAlert()
    {
    String getcolorOnRed=driver.findElement(By.xpath(BUTTON_REDBAR)).getCssValue("background-color");
    return getcolorOnRed;
   }

   public String TestcheckSuccess()
   {
       String getColorOnGreen=driver.findElement(By.xpath(BUTTON_GREENBAR)).getCssValue("background-color");
       return getColorOnGreen;

   }


   public void PrintIpsumvalues()
   {
       //WebElement ipsumColoumn1= driver.findElement(By.xpath("//div[@class=\"large-10 columns\"]/table/tbody/tr[1]/td[2]"));
       //System.out.println(ipsumColoumn1);


       List<WebElement> listElement1 = driver.findElements(By.xpath("//div[@class=\"large-10 columns\"]/table/tbody/tr/td"));
       for (WebElement objElement : listElement1){
           String linkText = objElement.getText();
           System.out.println("Elements are :"+linkText);
       }


   }

 }
