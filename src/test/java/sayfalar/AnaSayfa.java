package sayfalar;

import org.openqa.selenium.WebDriver;

public class AnaSayfa extends Sayfa{
    public final String hesabim = "myAccount";
    public final String girisYap = "login";
    public final String urunArama = ".searchBoxOld-M1esqHPyWSuRUjMCALPK";

    public AnaSayfa(WebDriver driver) {
        super(driver);
    }
}