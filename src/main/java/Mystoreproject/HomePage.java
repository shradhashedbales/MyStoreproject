package Mystoreproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SHRADHA on 23/01/2018.
 */
public class HomePage extends BasePage {


        @FindBy(css =".login")
        private WebElement signinbutton;

        public void checkTitle(){
            String title= driver.getTitle();
            System.out.println(" The title of the page is -->>" + title);
  }

        public void setSigninbutton(){
            signinbutton.click();
            signinbutton.getText();
            System.out.println("The button Signin got clicked -->"+signinbutton.getText() );
        }
    }

