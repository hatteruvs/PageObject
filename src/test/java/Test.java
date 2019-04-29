import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class Test {
    String siteHomePage = "https://pn.com.ua/";
    private WebDriver driver;
    private HomePage homepage;
    private ComputerPage computerPage;


    @BeforeClass
    public void testBeforeClass() throws Exception {
        driver = new ChromeDriver();
        driver.get(siteHomePage);
    }

    public void testComputerCategory() throws Exception {
        homepage = PageFactory.initElements(driver, HomePage.class);
        computerPage = homepage.choiceComputerCategory();
        System.out.println(computerPage.getTextITService());
        computerPage.getTextITService();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
        assertTrue(computerPage.getTextITService().contains("(2 модели)"));
    }
}
