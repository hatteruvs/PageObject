import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {
    private WebDriver driver;
    @FindBy(xpath="/html/body/div[1]/div[2]/div/div/div[1]/ul/li[3]/small")
    private WebElement numberOfGoods;

    public ComputerPage (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTextITService() {
        return numberOfGoods.getText();

    }
}
