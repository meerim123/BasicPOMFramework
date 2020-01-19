package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class EmployeeDashboard extends TestBase {
    public EmployeeDashboard() {
        PageFactory.initElements( driver, this );
    }

    @FindBy(className = "page-title")
    public WebElement dashboardTitle;

    @FindBy(id="menu_admin_viewAdminModule")
    public WebElement admin_Btn;

    @FindBy(id="menu_news_Announcements")
    public WebElement announcement_Btn;

    @FindBy(xpath="//a[@id='menu_news_viewNewsList']")
    public WebElement news_Btn;

    public void navigateToHomePage() {
        SeleniumUtils.click( admin_Btn );
        SeleniumUtils.click( announcement_Btn );
        SeleniumUtils.click( news_Btn );
    }








}
