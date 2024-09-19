package com.dedo.demo.config;

import com.dedo.demo.annotation.LazyConfiguration;
import com.dedo.demo.annotation.ThreadedScopeBean;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.PropertySource;

@LazyConfiguration
public class WebDriverConfig {
    @ThreadedScopeBean
    @ConditionalOnMissingBean
    public WebDriver chromeDriver(){
        WebDriverManager.chromedriver().setup();
        return  new ChromeDriver();
    }
    @ThreadedScopeBean
    @ConditionalOnExpression("${browser.edge:true}")
    public WebDriver edgeDriver(){
        WebDriverManager.edgedriver().setup();
        return  new EdgeDriver();
    }

}
