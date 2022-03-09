package MapObject;

import org.openqa.selenium.By;
import DemoNav.ClaseBaseFinalMobil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjetAlertsMobil extends ClaseBaseFinalMobil {

	public MapsObjetAlertsMobil(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	protected By btnClic1 = By.xpath("//android.widget.Button[@resource-id='alertButton']");
	protected By btnClic2 = By.xpath("//android.widget.Button[@resource-id='timerAlertButton']");
	protected By btnClic3 = By.xpath("//android.widget.Button[@resource-id='confirmButton']");
	protected By btnClic4 = By.xpath("//android.widget.Button[@resource-id='promtButton']");
	protected By btnBurger = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View/android.widget.Button");
	protected By alertsFrame = By.xpath("//android.widget.TextView[@text='Alerts, Frame & Windows']");
	protected By alerts = By.xpath("//android.widget.TextView[@text='Alerts']");
	protected By aceptarAlerts = By.xpath("//android.widget.Button[@resource-id='com.android.chrome:id/positive_button']");
	protected By btnOk= By.xpath("//android.widget.Button[@resource-id = 'com.android.chrome:id/positive_button']");
	protected By btnCancelar = By.xpath("//android.widget.Button[@resource-id = 'com.android.chrome:id/negative_button']");
	protected By campoNom = By.xpath("//android.widget.EditText[@resource-id='com.android.chrome:id/js_modal_dialog_prompt']");
	
}
