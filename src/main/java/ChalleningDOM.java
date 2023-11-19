import com.sun.jdi.PathSearchingVirtualMachine;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ChalleningDOM {

    public static Task task;


    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        task=new Task(driver);
        task.ClickOnMenu();
        /*String actualColor=task.GetcolorOnBlueBar();
        String expectedColor="#2ba6cb";
        Assert.assertEquals(actualColor,expectedColor);
        String actualColor2=task.GetColorOnRed();
        String expectedColor2="#c60f13";
        Assert.assertEquals(actualColor2,expectedColor2);
        String actualColor3=task.Getcolorongreen();
        String expectedColor3="#5da423";
        Assert.assertEquals(actualColor3,expectedColor3);*/
        task.PrintIpsumvalues();
    }
}
