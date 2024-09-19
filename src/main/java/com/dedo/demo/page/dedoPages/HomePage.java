package com.dedo.demo.page.dedoPages;

import com.dedo.demo.annotation.Page;
import com.dedo.demo.page.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Page
public class HomePage extends BaseClass {
    @FindBy(xpath = "//div[@id='comp-knd86aci']//a[@class='uDW_Qe wixui-button PlZyDq']")
    private WebElement contactUSBtn;
    @FindBy(xpath = "//div[@id='comp-knd6ut9v']//a[@class='uDW_Qe wixui-button PlZyDq']")
    private WebElement contactUSBtn2;
    @FindBy(xpath = "//p[@id='comp-knebed6b0label']")
    private WebElement aboutUsBtn;


    @Override
    public boolean isAt() {
        return this.wait.until((d) -> this.contactUSBtn2.isDisplayed());
    }
}
