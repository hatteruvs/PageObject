import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
    static WebDriver webdriver;
    String nameCompany;
    String numberOfGoods;

    @BeforeClass
    public static void setWebdriver() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\hatteruvs\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webdriver = new ChromeDriver();
        webdriver.get("https://pn.com.ua/");
    }
    @Test
    public void test1()
    {
        boolean condition = true;
        webdriver.findElement(By.xpath("//*[@id=\"column-center\"]/section/div[5]/ul/li[1]/a")).click();
        nameCompany = webdriver.findElement(By.xpath("//*[@id=\"producers-filter-block\"]/div[3]/span[3]/a")).getText();
        webdriver.findElement(By.xpath("//*[@id=\"producers-filter-block\"]/div[3]/span[3]/a")).click();
        System.out.println(nameCompany);
        String startString = "//*[@id=\"column-center\"]/section/div[3]/ul/li[";
        String endString = "]/article/div[2]/div[1]/a";
        for (int i=1;i<=24;i++)
        {
            String str = startString + i + endString;
            if (!(nameCompany.equals(webdriver.findElement(By.xpath(str)).getText().substring(0,3)))) {
                condition = false;
                System.out.println(i);
                break;
            }

        }
        Assert.assertEquals(condition,true);
    }

    @Test
    public void test2()
    {
        webdriver.get("https://pn.com.ua/");
        String numberOfGoods;
        boolean condition = true;
        webdriver.findElement(By.xpath("//*[@id=\"column-center\"]/section/div[5]/ul/li[1]/a")).click();
        numberOfGoods = webdriver.findElement(By.xpath("//*[@id=\"producers-filter-block\"]/div[3]/span[3]/small")).getText();
        webdriver.findElement(By.xpath("//*[@id=\"producers-filter-block\"]/div[3]/span[3]/a")).click();
        if (!(numberOfGoods.equals(webdriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/ul/li[3]/small/b")).getText())))
            condition = false;

        Assert.assertEquals(condition,true);
    }

    @Test
    public void test3()
    {
        webdriver.get("https://pn.com.ua/");
        String link1;
        boolean condition = true;
        webdriver.findElement(By.xpath("//*[@id=\"column-center\"]/section/div[3]/ul/li[3]/a")).click();
        webdriver.findElement(By.xpath("//*[@id=\"column-center\"]/section/div[3]/article[1]/div[2]/div[2]/span[2]/a")).click();
        webdriver.findElement(By.xpath("//*[@id=\"column-center\"]/section/div[3]/article[2]/div[2]/div[2]/span[2]/a")).click();
        webdriver.findElement(By.xpath("//*[@id=\"column-center\"]/section/div[1]/div[1]/a")).click();


        numberOfGoods = webdriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/ul/li[3]/small")).getText();
        if (!("(2 модели)".equals(numberOfGoods))) {
            condition = false;
        }

        webdriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/section/div[1]/ul/li[4]/a")).click();
        link1 = webdriver.findElement(By.xpath("//*[@id=\"static-link\"]")).getText();
        if (!("compare".equals(link1.substring(18,25))))
            condition = false;


        Assert.assertEquals(condition,true);
        webdriver.close();
    }

    @Test
    public void test4()
    {
        webdriver = new ChromeDriver();
        webdriver.get("https://pn.com.ua/");
        boolean condition = true;
        webdriver.findElement(By.xpath("//*[@id=\"column-center\"]/section/div[3]/ul/li[3]/a")).click();
        webdriver.findElement(By.xpath("//*[@id=\"column-center\"]/section/div[3]/article[1]/div[2]/div[2]/span[2]/a")).click();
        webdriver.findElement(By.xpath("//*[@id=\"column-center\"]/section/div[3]/article[2]/div[2]/div[2]/span[2]/a")).click();
        webdriver.findElement(By.xpath("//*[@id=\"column-center\"]/section/div[3]/article[3]/div[2]/div[2]/span[2]/a")).click();
        webdriver.findElement(By.xpath("//*[@id=\"column-center\"]/section/div[3]/article[4]/div[2]/div[2]/span[2]/a")).click();
        webdriver.findElement(By.xpath("//*[@id=\"column-center\"]/section/div[1]/div[1]/a")).click();

        numberOfGoods = webdriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/ul/li[3]/small")).getText();
        if (!("(4 модели)".equals(numberOfGoods))) {
            condition = false;
        }

        webdriver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/div[1]/div/div[4]/a")).click();
        numberOfGoods = webdriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/ul/li[3]/small")).getText();
        if (!("(3 модели)".equals(numberOfGoods))) {
            condition = false;
        }

        Assert.assertEquals(condition,true);
        webdriver.close();
    }

    @Test
    public void test5()
    {
        webdriver = new ChromeDriver();
        webdriver.get("https://pn.com.ua/");
        boolean condition = true;
        webdriver.findElement(By.xpath("//*[@id=\"column-center\"]/section/div[3]/ul/li[3]/a")).click();
        webdriver.findElement(By.xpath("//*[@id=\"column-center\"]/section/div[3]/article[1]/div[2]/div[2]/span[2]/a")).click();
        webdriver.findElement(By.xpath("//*[@id=\"column-center\"]/section/div[3]/article[2]/div[2]/div[2]/span[2]/a")).click();
        webdriver.findElement(By.xpath("//*[@id=\"column-center\"]/section/div[3]/article[3]/div[2]/div[2]/span[2]/a")).click();
        webdriver.findElement(By.xpath("//*[@id=\"column-center\"]/section/div[3]/article[4]/div[2]/div[2]/span[2]/a")).click();
        webdriver.findElement(By.xpath("//*[@id=\"column-center\"]/section/div[1]/div[1]/a")).click();
        webdriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/section/div[2]/div/div[1]/div[1]/a")).click();
        Alert alert = webdriver.switchTo().alert();
        alert.accept();


        Assert.assertEquals(condition,true);
    }

    @Test
    public void test6()
    {
        webdriver.get("https://pn.com.ua/");
        nameCompany = "Samsung";
        boolean condition = true;
        webdriver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/input")).sendKeys("Samsung");
        webdriver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[3]/input")).click();
        webdriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div/section/article[1]/ul/li[1]/ul/li[1]/a")).click();

        String startString = "//*[@id=\"column-center\"]/section/div[3]/article[";
        String endString = "]/div[2]/div[1]/a";
        for (int i=1;i<=24;i++)
        {
            String str = startString + i + endString;
            if (!(nameCompany.equals(webdriver.findElement(By.xpath(str)).getText().substring(0,7)))) {
                condition = false;
                System.out.println(i);
                break;
            }

        }

        Assert.assertEquals(condition,true);
    }



    @AfterClass
    public static void closeWeb(){
        webdriver.close();
    }
}
