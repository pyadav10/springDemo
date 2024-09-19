package com.dedo.demo.page;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

public abstract class BaseClass {

    @Autowired
    protected WebDriver driver;
    @Autowired
    protected WebDriverWait wait;

    @PostConstruct
    private void init(){
        PageFactory.initElements(this.driver, this);
    }
    @Value("${application.url}")
    private  String url;

    public void goTo(){

        this.driver.get(url);
    }

    public abstract boolean isAt();
    public void close(){
        this.driver.quit();
    }
}
