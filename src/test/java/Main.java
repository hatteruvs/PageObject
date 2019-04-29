import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        String siteHomePage = "https://pn.com.ua/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hatteruvs\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(siteHomePage);
        HomePage homepage;
        ComputerPage computerPage;
        homepage = PageFactory.initElements(driver, HomePage.class);
        computerPage  = homepage.choiceComputerCategory();

    }
}
