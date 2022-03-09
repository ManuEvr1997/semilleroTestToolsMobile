package MapObject;

import org.openqa.selenium.By;
import DemoNav.ClaseBaseFinalMobil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjetWebTMobil extends ClaseBaseFinalMobil {
	// CONSTRUCTOR DE LA CLASE
	public MapsObjetWebTMobil(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;

	}

	protected By btnSubmit = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]/android.widget.Button");
			//						  "//android.widget.Button[@text ='Submit']"
	protected By quitarPublic = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[1]");
	protected By delete = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.widget.GridView/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View/android.view.View[2]/android.widget.Image");
	//IR A TABLA
	protected By Table = By.xpath("//android.widget.TextView[@text='Web Tables']");
	//AGREGAR TABLA
	protected By add = By.xpath("//android.widget.Button[@resource-id='addNewRecordButton']");

}
