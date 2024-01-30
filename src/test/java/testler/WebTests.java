package testler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sayfalar.AnaSayfa;
import sayfalar.GirisYapSayfasi;

public class WebTests {

    private WebDriver driver;
    private AnaSayfa anaSayfa;
    private GirisYapSayfasi girisYapSayfasi;

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa = new AnaSayfa(driver);
        girisYapSayfasi = new GirisYapSayfasi(driver);
        driver.get("https://www.hepsiburada.com");
    }

    @Test
    void LoginTesti(){
        anaSayfa.bekle(anaSayfa.hesabim);
        anaSayfa.tusaBas(anaSayfa.hesabim);
        anaSayfa.bekle(anaSayfa.girisYap);
        anaSayfa.tusaBas(anaSayfa.girisYap);
        girisYapSayfasi.bekle(girisYapSayfasi.emailAdresi);
        girisYapSayfasi.yaziYaz(girisYapSayfasi.emailAdresi, "seleniumotomasyonu@gmail.com");
        girisYapSayfasi.bekle(girisYapSayfasi.girisYapTusu);
        girisYapSayfasi.tusaBas(girisYapSayfasi.girisYapTusu);
    }

    @Test
    void urunAramaTesti(){
        anaSayfa.bekleCss(anaSayfa.urunArama);
        anaSayfa.yaziYazCss(anaSayfa.urunArama, "Gamebook");
        anaSayfa.klavyeTusunaBas(anaSayfa.urunArama, Keys.ENTER);
    }

    @AfterEach
    void tearDown(){
        driver.close();
    }
}