import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class WebTablesAssignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");

        WebElement table = driver.findElement(By.id("product"));
        //Row
        System.out.println(table.findElements(By.tagName("tr")).size());
        //Header
        System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
        List<WebElement> secondRow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
        System.out.println(secondRow.get(0).getText());
        System.out.println(secondRow.get(1).getText());
        System.out.println(secondRow.get(2).getText());
    }
}

//Another Second Program
//
//import java.util.List;
//import java.util.stream.Collectors;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//public class filter {
//    public static void main(String[] args) {
//
//        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://rahulshettyacademy.com/greenkart/#/offers");
//        driver.findElement(By.id("search-field")).sendKeys("Rice");
//        List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
//        //1 results
//        List<WebElement> filteredList= veggies.stream().filter(veggie->veggie.getText().contains("Rice")).
//                collect(Collectors.toList());
//        //1 result
//        Assert.assertEquals(veggies.size(), filteredList.size());
//    }
//}