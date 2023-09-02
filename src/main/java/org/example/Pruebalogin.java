package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pruebalogin {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Helmer Rodriguez\\IdeaProjects\\Test2\\src\\main\\resources\\chromedriver.exe");

        //Arrancar
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");

        driver.manage().window().maximize();

        //variables guardar
        String usuario = "standard_user";
        String contrasena= "secret_sauce";

        //localizar elementos
        WebElement usuarioEntrada = driver.findElement(By.id("user-name"));
        WebElement contrasenaEntrada = driver.findElement(By.id("password"));

        //localizado por XPATH
        WebElement btnIngresar = driver.findElement(By.xpath("//input[@id='login-button']"));

        //Hcaer Login
        usuarioEntrada.sendKeys(usuario);
        contrasenaEntrada.sendKeys(contrasena);
        btnIngresar.click();

        //Localizar elementos
        WebElement btnAgregar1 = driver.findElement(By.xpath("//div[@class='inventory_list']/div[1]//button[@class='btn_primary btn_inventory']"));
        btnAgregar1.click();
        WebElement btnAgregar2 = driver.findElement(By.xpath("//div[@class='inventory_list']/div[2]//button[@class='btn_primary btn_inventory']"));
        btnAgregar2.click();
        WebElement btnAgregar3 = driver.findElement(By.xpath("//div[@class='inventory_list']/div[3]//button[@class='btn_primary btn_inventory']"));
        btnAgregar3.click();
        WebElement btnAgregar4 = driver.findElement(By.xpath("//div[4]//button[@class='btn_primary btn_inventory']"));
        btnAgregar4.click();
        WebElement btnAgregar5 = driver.findElement(By.xpath("//div[5]//button[@class='btn_primary btn_inventory']"));
        btnAgregar5.click();
        WebElement btnAgregar6 = driver.findElement(By.xpath("//div[6]//button[@class='btn_primary btn_inventory']"));
        btnAgregar6.click();
        WebElement btnCarrito = driver.findElement(By.xpath("//a[@href='./cart.html']"));
        btnCarrito.click();

        //Check
        WebElement btnCheck = driver.findElement(By.xpath("//a[.='CHECKOUT']"));
        btnCheck.click();

        //Variables Datos
        String FirstName = "Helmer";
        String LastName = "Rodriguez";
        String Postal = "25065";

        //Localizar
        WebElement First = driver.findElement(By.id("first-name"));
        WebElement Last = driver.findElement(By.id("last-name"));
        WebElement Post = driver.findElement(By.id("postal-code"));
        WebElement btnContin = driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));

        //Llenar informacion
        First.sendKeys(FirstName);
        Last.sendKeys(LastName);
        Post.sendKeys(Postal);
        btnContin.click();

        //Finish
        WebElement fin = driver.findElement(By.xpath("//a[.='FINISH']"));
        fin.click();








    }
}
