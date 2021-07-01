import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.Assert.*;



public class StepImplementation extends  BaseTest{

    @Step("<id> id li elemente tıkla")
    public void clickById(String id){
        appiumFluentWait.until(ExpectedConditions.elementToBeClickable(appiumDriver.findElement(By.id(id))));
        appiumDriver.findElement(By.id(id)).click();

    }

    @Step("<id> id li elementten current datei alıp new datei set et")
    public void clickByIdText(String id){
        appiumFluentWait.until(ExpectedConditions.elementToBeClickable(appiumDriver.findElement(By.id(id))));
        int currentDay = Integer.parseInt(appiumDriver.findElement(By.id(id)).getText());
        int plusTwoDays = currentDay + 2;
        String newDay = Integer.toString(plusTwoDays);
        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text='" + newDay + "']")).click();
    }

    @Step("<xpath> xpath li elemente tıkla")
    public void clickByXpath(String xpath){
        appiumFluentWait.until(ExpectedConditions.elementToBeClickable(appiumDriver.findElement(By.xpath(xpath))));
        appiumDriver.findElement(By.xpath(xpath)).click();

    }

    @Step("<id> id li elemente <key> degerini yaz")
    public void  sendKeys(String id, String key){
        appiumFluentWait.until(ExpectedConditions.elementToBeClickable(appiumDriver.findElement(By.id(id))));
        appiumDriver.findElement(By.id(id)).sendKeys(key);

    }


    @Step("Check if list is viewed or not")
    public void checkList(){
    assertNotNull("Liste görüntülenmedi",appiumDriver.findElement(By.id("com.turkishairlines.mobile:id/frFlightSearch_rvFlight")).getSize());
    System.out.println("List is visible");
    }



    @Step("<x> kadar bekle")
    public void waitForSecond(int x) throws InterruptedException {
        Thread.sleep(1000*x);
    }

}
