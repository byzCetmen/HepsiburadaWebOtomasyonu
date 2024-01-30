package sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sayfa {

    WebDriver driver;

    public Sayfa(WebDriver driver) {
        this.driver = driver;
    }

    public void bekle(String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.elementToBeClickable(By.id(elementId)));
    }

    public void bekleCss(String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(elementId)));
    }

    public void tusaBas(String tusId){
        driver.findElement(By.id(tusId)).click();
    }

    public void yaziYaz(String elementId, String emailAdresi){
        driver.findElement(By.id(elementId)).sendKeys(emailAdresi);
    }

    public void yaziYazCss(String elementId, String urun){
        driver.findElement(By.cssSelector(elementId)).sendKeys(urun);
    }

    public void klavyeTusunaBas(String elementId, Keys klavyeTusu){
        driver.findElement(By.cssSelector(elementId)).sendKeys(klavyeTusu);
    }
}