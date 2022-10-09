package aid.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    //Аннотацию для теста!(позволяет пояснить джава что это тест и позволяет запустить)
    @Test
    public void test(){
        //Для windows
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Переход на сайт
        driver.get("http://www.sberbank.ru/ru/person");
    }




}
