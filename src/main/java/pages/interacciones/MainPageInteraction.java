package pages.interacciones;

import org.fluentlenium.core.annotation.Page;
import pages.mapeos.MainPage;

public class MainPageInteraction extends GeneralInteraction {

    @Page
    private MainPage mainPage;

    public String getTitleMainPage() {
        return mainPage.txtTitleMainPage.waitUntilVisible().getText();
    }

}
