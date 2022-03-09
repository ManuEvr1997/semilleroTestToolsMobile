package MapObject;

import org.openqa.selenium.By;


import DemoNav.ClaseBaseFinalMobil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapsObjetElementsMobil extends ClaseBaseFinalMobil 
{
	public MapsObjetElementsMobil (AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver = driver;
		
	}

	//ACCEDIENDO AL LINK
	protected By SearchBar = By.id("com.android.chrome:id/url_bar");
	//SELECCIONA EL VINCULO A ACCEDER
	protected By selecVinculo = By.xpath("//android.widget.TextView[@text='https://demoqa.com']");
	//ACCEDIENDO AL BLOQUE --ELEMENTS
	protected By btnElement = By.xpath("//android.view.View[@text='Elements']");
		//ELIMINAR REGISTRO
	protected By Delete = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[3]/android.widget.GridView/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[4]/android.view.View/android.view.View[2]/android.widget.Image");
	
}
 