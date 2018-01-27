package Mystoreproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.ws.FaultAction;

/**
 * Created by SHRADHA on 23/01/2018.
 */
public class AunthenticationPage extends BasePage {

    @FindBy(css= "#email_create")
    private WebElement validateemail;

    @FindBy(css ="#SubmitCreate")
    private WebElement submitemail;

    public void setAuthenticationEmail()
    {
        validateemail.sendKeys("sshilpa@gmail.com");
    }

    public void emailConfirmationbutton()
    {
        submitemail.click();
    }
}
