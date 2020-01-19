package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EmployeeDashboard;
import pages.HomePage;

public class EmployeeDashboardTest extends TestBase {
    HomePage homePage;
    EmployeeDashboard employeeDashboard;

    @BeforeMethod
    public void setUp() {
        initializer();
        homePage = new HomePage();
        employeeDashboard = new EmployeeDashboard();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void verifyNewsPage() {
        homePage.navigateToHomePage();
        employeeDashboard.navigateToHomePage();
        Assert.assertEquals( employeeDashboard.dashboardTitle.getText(), "News List");
    }



}
