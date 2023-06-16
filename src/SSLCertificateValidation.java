
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class SSLCertificateValidation {

    public static void main(String[] args) {
//SSl certificates
//Desired capabilities=
//general chrome profile
        DesiredCapabilities ch = new DesiredCapabilities();
//ch.acceptInsecureCerts();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        //ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        ChromeOptions chromeOption = new ChromeOptions();
        chromeOption.setAcceptInsecureCerts(true);
        chromeOption.merge(ch);
        System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(chromeOption);
    }

}
