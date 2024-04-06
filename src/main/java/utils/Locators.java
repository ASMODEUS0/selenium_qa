package utils;


import org.openqa.selenium.By;

public interface Locators {

    interface MainPage {
        //buttons
        By BUY_BUTTON = By.xpath("/html/body/section[1]/div[2]/div/div[2]/div[1]/div/div/div[6]/a");
        By SUB_MENU = By.xpath("/html/body/header/div/div/div[1]/div/label");
        By DELETE_REGION_WORD_BUTTON = By.xpath("/html/body/section[1]/div[3]/section/div[2]/div/div/form/div[1]/div/i[1]");

        //text boxes
        By REGION_TEXT_BOX = By.xpath("//*[@id=\"region\"]");
        By CITY_TEXT_BOX = By.xpath("//*[@id=\"city\"]");


        By FIRST_REGION_IN_LIST_BUTTON = By.xpath("/html/body/section[1]/div[3]/section/div[2]/div/div/form/div[1]/div/span/div/div[3]/div");
        By FIRST_CITY_IN_LIST_BUTTON = By.xpath("/html/body/section[1]/div[3]/section/div[2]/div/div/form/div[2]/div/span/div/div[3]/div");

        By SHOP_LIST_BUTTON = By.xpath("/html/body/section[1]/div[3]/section/div[2]/div/div/ul/li[2]/i");
        By FIRST_SHOP_NAME_BLOCK = By.xpath("/html/body/section[1]/div[3]/section/div[3]/div[1]/div/div[3]/div/div/div/p");
        By SEARCH_BUTTON = By.xpath("/html/body/header/div/div/ul[2]/li[5]/a");
        By SEARCH_TEXT_BOX = By.xpath("/html/body/header/div/div/div[2]/form/input");
        By START_SEARCH_BUTTON = By.xpath("/html/body/header/div/div/div[2]/form/button");
        By NAME_OF_FIRST_PRODUCT_IN_PRODUCT_LIST = By.xpath("/html/body/section[2]/div/div[3]/div[1]/div/div/div[4]");

        By CATALOG_BUTTON = By.xpath("/html/body/header/div/div/ul[2]/li[3]/a");
    }

    interface DeliveryPage {
    }

    interface ProductPage {
        By FOOD_TITLE_OBJECT = By.xpath("/html/body/div[4]/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div[2]/span");
        By ADD_TO_BASKET_BUTTON = By.xpath("/html/body/div[4]/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div[3]/div[2]/div/div");
        By BUSKET_BUTTON = By.xpath("//*[@id=\"header_basket\"]");
    }


    interface BasketPage {
        By BASKET_FIRST_ELEMENT = By.xpath("/html/body/div[7]/div/div/div/div[3]/div[1]/div[2]/div/div[1]/div[2]/span");
        By BASKET_GOODS_COUNT = By.xpath("/html/body/div[7]/div/div/div/div[3]/div[1]/div[3]/div[1]/div");
        By MAIN_ELEMENT = By.xpath("/html/body/div[7]/div/div/div/div[3]/div[2]");
    }


    interface SubMenu {
        By CAREER_BUTTON = By.xpath("/html/body/header/div/div/div[1]/div/aside/div[2]/div/div[1]/ul/li[2]/a");

    }

    interface CareerMenuPage {
        By SEND_REQUEST_BUTTON = By.xpath("/html/body/section[2]/div/div/div[1]/div/div/div[2]/a/img");

    }

    interface CareerFormPage {
        By FORM_NAME = By.xpath("/html/body/div[2]/div[2]/div[1]");
    }
    interface FilterPage{
        By FILTER_MENU_BUTTON = By.xpath("/html/body/section[3]/div/div[1]/div[1]");
        By COFFEE_TEA_FILTER_BUTTON = By.xpath("/html/body/section[3]/div/div[1]/div[3]/ul[2]/li[3]");
        By NAME_OF_FIRST_PRODUCT_IN_FILTER_LIST = By.xpath("/html/body/section[3]/div/div[3]/div[1]/div/div/div[4]");
    }

//     interface JavaPage{
//        By  JAVA_EE_BUTTON = By.xpath("//*[@class='navmenu']/a[3]");
//    }
//
//    //Оптимизировать xpath!!!
//     interface JavaEEPage{
//        By ABOUT_JAVA_EE_BUTTON = By.xpath("/html/body/div[@id='container']/div[@class='outercontainer']/div[@class='innercontainer']/div[@class='item center menC']/ol[@class='content']/li[1]/ol[@class='subsubcontent']/li/p/a");
//        By TEXT_ABOUT_JAVA = By.xpath("/html/body/div[@id='container']/div[@class='outercontainer']/div[@class='innercontainer']/div[@class='item center menC']/p[1]");
//        By TEXT_ABOUT_JAVA_SERVLETS = By.xpath("/html/body/div[@id='container']/div[@class='outercontainer']/div[@class='innercontainer']/div[@class='item center menC']/ul/li[1]/p");
//    }

}