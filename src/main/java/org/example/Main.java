package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    private static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Helmer Rodriguez\\IdeaProjects\\Test2\\src\\main\\resources\\chromedriver.exe");

        //arrancar el navegador
        driver = new ChromeDriver();

        //abrir pagina
        driver.get("https://ionic.io/ionicons/v4");

        //maximizar el navegador
        driver.manage().window().maximize();


        }
    }