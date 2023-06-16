import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentSix {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");

        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();

        String textOption = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));

        Select s = new Select(dropdown);
        s.selectByVisibleText(textOption);

        driver.findElement(By.name("enter-name")).sendKeys((textOption));

        driver.findElement(By.id("alertbtn")).click();
        //Verifying Alert Name
        String textElement = driver.switchTo().alert().getText();
        if(textElement.contains(textOption)){
            System.out.println("Alert Message succes");
        }else{
            System.out.println("Something wrong with execution");
        }

    }


}
