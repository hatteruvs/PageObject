import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    @FindBy (xpath="//*[@id=\"column-center\"]/section/div[3]/ul/li[3]/a")
    private WebElement click1;
    @FindBy (xpath ="//*[@id=\"column-center\"]/section/div[3]/article[1]/div[2]/div[2]/span[2]/a")
    private WebElement click2;
    @FindBy (xpath ="//*[@id=\"column-center\"]/section/div[3]/article[2]/div[2]/div[2]/span[2]/a")
    private WebElement click3;
    @FindBy (xpath ="//*[@id=\"column-center\"]/section/div[1]/div[1]/a")
    private WebElement click4;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ComputerPage choiceComputerCategory() throws InterruptedException{
        click1.click();
        click2.click();
        click3.click();
        click4.click();
        return new ComputerPage(driver);
    }
}
