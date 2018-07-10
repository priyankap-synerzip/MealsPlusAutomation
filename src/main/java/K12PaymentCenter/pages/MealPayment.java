package K12PaymentCenter.pages;

import K12PaymentCenter.utils.DriverHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yaml.snakeyaml.Yaml;

import java.util.Collections;
import java.util.Map;

public class MealPayment {
    protected Map<String, String> xpaths;
    protected AndroidDriver driver;
    private MobileElement addButton;
    private MobileElement addAmountTextbox;
    private MobileElement addToCartButton;
    private MobileElement addPaymentSuccessMessage;
    private MobileElement addPaymentOkButton;

    public MealPayment(AndroidDriver driver){
        this.driver=driver;
        Yaml mealPaymentYML = new Yaml();
        this.xpaths = (Map) mealPaymentYML.load(this.getClass().getClassLoader().getResourceAsStream("locators/MealPayment.yml"));

    }

    public MobileElement getAddButton(){
        WebDriverWait wait = new WebDriverWait(this.driver, 90);
        addButton = DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADD_BUTTON"), this.driver);
        wait.until(ExpectedConditions.visibilityOf(addButton));
        return addButton;
    }

    public MobileElement getAddAmountTextbox(){
        addAmountTextbox=DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDAMOUNT_TEXTBOX"),this.driver);
        return addAmountTextbox;

    }

    public MobileElement getAddToCartButton(){
        addToCartButton=DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDTOCART_BUTTON"),this.driver);
        return addToCartButton;
    }

    public MobileElement getAddPaymentSuccessMessage(){
        addPaymentSuccessMessage=DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDPAYMENT_SUCCESSMESSAGE"),this.driver);
        return addPaymentSuccessMessage;
    }

    public MobileElement getAddPaymentOkButton(){
        addPaymentOkButton=DriverHelper.getMobileElement(this.xpaths.get("BY_XPATH_ADDPAYMENT_SUCCESSOKBUTTON"),this.driver);
        return addPaymentOkButton;
    }
}