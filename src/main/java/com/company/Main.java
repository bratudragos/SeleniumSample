package com.company;

        import org.openqa.selenium.*;
        import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/bratudragos/Desktop/info/libsSelenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("JBL earphones");
        WebElement searchIcon = driver.findElement(By.className("nav-input"));
        searchIcon.click();
        //WebElement checkBox = driver.findElement(By.linkText("/s?k=JBL+earphones&rh=n%3A172541%2Cp_n_feature_two_browse-bin%3A12097488011&dc&qid=1600763936&rnid=2266979011&ref=sr_nr_p_n_feature_two_browse-bin_1"));
        //checkBox.click();
        js.executeScript("window.scrollBy(0,4000)");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }
}
