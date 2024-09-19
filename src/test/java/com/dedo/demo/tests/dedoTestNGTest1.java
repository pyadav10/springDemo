package com.dedo.demo.tests;

import com.dedo.demo.SpringBaseTestNGTest;
import com.dedo.demo.page.dedoPages.HomePage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.Test;

public class dedoTestNGTest1 extends SpringBaseTestNGTest {
    @Autowired
    private HomePage homePage;


    @Test
    public void homePageTest(){
       this.homePage.goTo();
    }
}
