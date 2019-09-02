package com.Brite_Erp.Utilities;

import com.Brite_Erp.Pages.LoginNavigation.LoginPage;


public class Pages {
    private LoginPage loginPage;



    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

}
