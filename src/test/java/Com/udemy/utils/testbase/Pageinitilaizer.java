package Com.udemy.utils.testbase;

import Com.udemy.utils.pages.RahulMainPage;

public class Pageinitilaizer extends BaseClass{
    public static RahulMainPage rahulMainPage;

    public static void initilaizingPages(){
        rahulMainPage=new RahulMainPage();
    }
}
