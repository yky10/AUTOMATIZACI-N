package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;

    // Bloque estático para inicializar el WebDriver y WebDriverWait
    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        // Configuramos WebDriverWait con Duration.ofSeconds(7)
        wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\ab189\\OneDrive\\Escritorio\\repoAutomatizacion\\chromedriver.exe");
    }

    // Constructor de la clase
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(7));
    }

    // Método para navegar a una URL
    public static void navigateTo(String url) {
        driver.get(url);
    }


    public void cerrarNavegadorclose() {
        if (driver != null) {
            try {
                Thread.sleep(10000); // Espera 15 segundos antes de cerrar
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}