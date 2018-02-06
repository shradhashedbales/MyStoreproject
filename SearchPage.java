package Mystoreproject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.PageFactory.*;

/**
 * Created by SHRADHA on 27/01/2018.
 */
public class SearchPage extends BasePage {
@FindBy(css = "ul[class*='sf-menu clearfix menu'] li a")
List<WebElement> menulist;

@FindBy(xpath="//input[@id='search_query_top']")
private WebElement searchitem;

public void choose_requested_menu_options(String choose_menu) {
    for (WebElement menu : menulist) {
        if (menu.getText().trim().contains(choose_menu)) {
            menu.click();
            break;
        }
    }
}
 public void add_search_item ()
    {
        searchitem.sendKeys("dresses");
        searchitem.click();
    }
}




