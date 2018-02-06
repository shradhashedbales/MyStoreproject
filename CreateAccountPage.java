    package Mystoreproject;

    import cucumber.api.java.gl.E;
    import gherkin.lexer.Th;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.ui.Select;

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
        //input[contains(@id,'passwd')]

        @FindBy(xpath = "//input[@name='passwd']")
        private WebElement password;

        @FindBy(xpath =  ".//*[@id='days']/option")
        private List<WebElement> daylist;

        @FindBy(xpath =  ".//*[@id='months']/option")
       private List<WebElement> month_list;

        @FindBy(xpath =  ".//*[@id='years']/option")
        private List<WebElement> years;


       /* Your address-*/

        @FindBy (css ="#firstname")
        private WebElement First_name;

        @FindBy (css ="#lastname")
        private WebElement last_name;

        @FindBy (css = "#company")
        private WebElement company;

        @FindBy (css = "#address1")
        private WebElement address1;

        @FindBy (css = "#city")
        private WebElement city;

        @FindBy(xpath =  "//*[@id='id_state']/option[4]")
        List<WebElement> statelist;

        @FindBy (css = "#postcode")
        private WebElement postcode;

        @FindBy(xpath =  ".//*[@id='id_country']/option[2]")
        List<WebElement> countrylist;

        @FindBy(css = "#phone_mobile")
        private WebElement mobilenumber;

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
        public void setemail()
        {

            email.sendKeys("sslohare@gmail.com");
            email.click();
        }

        public void setPassword(String pwd) throws InterruptedException {
            Thread.sleep(2000);
            password.sendKeys("shilpa2302");
            password.click();
        }


        public void select_day_options(String day_list)
        {
            for (WebElement day:daylist)
            {
                if (day.getText().trim().contains(day_list))
                {
                    day.click();
                    break;
                }
            }
        }



        public void select_month_options(String monthlist)
        {
            for (WebElement month:month_list)
            {
                if (month.getText().trim().contains(monthlist))
                {
                    month.click();
                    month.sendKeys("");
                    break;
                }
            }
        }

        public void select_years_options(String year_list)
        {
            for (WebElement year:years)
            {
                if (year.getText().trim().contains(year_list))
                {
                    year.click();
                    break;
                }
            }
        }

        public void setcompany_Last_name()
        {

            last_name.sendKeys("Shedbale");
        }

        public void setcompany_First_name()
        {

            First_name.sendKeys("Shradha");
        }

        public void setAddress_1()
        {

            address1.sendKeys("70 bushway dagenham");
        }

        public void setCity()
        {
            city.sendKeys("Dagenham");
        }

        public void select_state_options(String state_list)
        {
            for (WebElement list:statelist)
            {
                if (list.getText().trim().contains(state_list))
                {
                    list.isSelected();
                    break;
                }
            }
        }


    public void  set_postcode()
    {
        postcode.sendKeys("rm8 3xd");
    }

        public void select_country_options(String country)
        {

            for (WebElement menu:countrylist)
            {
                if (menu.getText().trim().contains(country))
                {
                    menu.isSelected();
                    break;
                }
            }
        }


        public void set_mobilenumber()
        {
            mobilenumber.sendKeys("07523523521");
        }

        @FindBy(css = "#alias")
        private WebElement addressalias;

        public void set_addressalias()
        {
            addressalias.sendKeys("essex");
        }

        @FindBy(xpath = "(.//*[@id='submitAccount'])")
        private WebElement registerbutton;

        public void submitbutton()
        {
            registerbutton.click();
        }

    }


