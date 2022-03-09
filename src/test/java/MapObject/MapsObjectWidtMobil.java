package MapObject;

import org.openqa.selenium.By;
import DemoNav.ClaseBaseFinalMobil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjectWidtMobil extends ClaseBaseFinalMobil

{
	public MapsObjectWidtMobil(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	// 				/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[3]/android.widget.ListView/android.view.View[4]"
	// 							   /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.widget.ListView/android.view.View[4]
	// /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.widget.ListView/android.view.View[4]/android.widget.TextView
	protected By widget = By.id("//android.widget.TextView[@text='Widgets']");
	protected By dataPicker = By.xpath("//android.widget.TextView[@text='Date Picker']");
	protected By selectdate = By.xpath("//android.widget.EditText[@resource-id='datePickerMonthYearInput']");
	protected By dateMonthDateHour = By.xpath("//android.widget.EditText[@resource-id='dateAndTimePickerInput']");
}

