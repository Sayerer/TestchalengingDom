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


   public void PrintIpsumvalues() {


       List<WebElement> rowList = driver.findElements(By.xpath("//div[@class=\"large-10 columns\"]/table/tbody/tr"));

       int numRows = rowList.size();
       int i = 0;
       for (i = 0; i > numRows + 1; i++) ;
       {
           List<WebElement> cellList = driver.findElements(By.xpath("//div[@class=\"large-10 columns\"]/table/tbody/tr/td[2]"));
           for (WebElement objElement : cellList) {
               String linkText = objElement.getText();
               System.out.println("Elements in Ipsum are :" + linkText);
           }


       }
   }
       public void PrintDolorvalues() {


           List<WebElement> rowList1 = driver.findElements(By.xpath("//div[@class=\"large-10 columns\"]/table/tbody/tr"));

           int numRows1 = rowList1.size();
           System.out.println("Row size :" + numRows1);
           int i = 0;
           for (i = 0; i > numRows1 + 1; i++) ;
           {
               List<WebElement> cellList1 = driver.findElements(By.xpath("//div[@class=\"large-10 columns\"]/table/tbody/tr/td[3]"));
               for (WebElement objElement1 : cellList1) {
                   String linkText1 = objElement1.getText();
                   System.out.println("Elements in Dolor are :" + linkText1);
               }


           }
       }

           public void PrintAmetvalues()
           {


               List<WebElement> rowList2 = driver.findElements(By.xpath("//div[@class=\"large-10 columns\"]/table/tbody/tr"));

               int numRows2 = rowList2.size();
               System.out.println("Row size :" + numRows2);
               int i = 0;
               for (i = 0; i > numRows2 + 1; i++) ;
               {
                   List<WebElement> cellList2 = driver.findElements(By.xpath("//div[@class=\"large-10 columns\"]/table/tbody/tr/td[4]"));
                   for (WebElement objElement2 : cellList2) {
                       String linkText2 = objElement2.getText();
                       System.out.println("Elements in Amet are :" + linkText2);
                   }


               }


           }

 }
