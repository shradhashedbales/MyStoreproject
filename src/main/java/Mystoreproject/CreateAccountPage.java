package Mystoreproject;

import cucumber.api.java.gl.E;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by SHRADHA on 24/01/2018.
 */
public class CreateAccountPage extends BasePage {

     @FindBy(css = "#customer_firstname")
    private WebElement firstname;

    @FindBy (css  ="#customer_lastname")
    private WebElement lastname;

    @FindBy (css = "#email")
    private WebElement email;

    public void setemail()
    {
        email.sendKeys("sslohare@gmail.com");
    }

    @FindBy (css = "#passwd")
    private WebElement password;

    public void setPassword()
    {
        password.sendKeys("shilpa2302");
    }

    @FindBy (css ="#days")
    private WebElement dobday;

    @FindBy (css = "#months")
    private WebElement dobmonth;

    @FindBy (css = "#years")
    private WebElement dobyear;

   /* Your address-*/

   @FindBy (css ="#firstname")
   private WebElement First_name;

   public void setFirst_name()
   {

       First_name.sendKeys("Shradha");
   }

    @FindBy (css ="#lastname")
    private WebElement last_name;


    public void setLast_name()
    {

        last_name.sendKeys("Shedbale");
    }
    @FindBy (css = "#company")
    private WebElement company;

    @FindBy (css = "#address1")
    private WebElement address1;


    public void setAddress_1()
    {

        address1.sendKeys("70 bushway dagenham");
    }

    @FindBy (css = "#city")
    private WebElement city;

    public void setCity()
    {
        city.sendKeys("Dagenham");
    }

    @FindBy (css = "#postcode")
    private WebElement postcode;

    @FindBy(css = "#id_country")
    private WebElement country;

    @FindBy(css = "#phone_mobile")
    private WebElement mobilenumber;

    @FindBy(css = "#alias")
    private WebElement addressalias;

    @FindBy(xpath = "(.//*[@id='submitAccount'])")
    private WebElement address_alias;


    public void setFirstname()
    {
        firstname.click();
        firstname.sendKeys("shilpa");

    }

    public void setLastname()
    {
        lastname.click();
        lastname.sendKeys("Lohare");
    }


    public void  dateofbirthday(String day,String month,String year)
    {
        // dobday.click();
        dobday.sendKeys("27");
        dobmonth.sendKeys("March");
        dobyear.sendKeys("1989");
    }

    public void setEmail()
    {
        email.click();
        // email.sendKeys("slohare@yahoo.co.uk");
        email.sendKeys("sslohare@gmail.com");
    }

    public void setCompany(String Company)
    {
        company.click();
        company.sendKeys("ssi ltd");
    }

    public void setPassword(String pwd)
    {
        //password.click();
        password.sendKeys("shilpa2302");


    }

    public void submitbutton()
    {
        submit.click();
    }

}


