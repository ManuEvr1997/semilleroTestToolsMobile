package PageObject;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import MapObject.MapsObjetWebTMobil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import utilidadesExcel.ReadExcelFile;

public class PagsObjetWebTMobil extends  MapsObjetWebTMobil
{
	public PagsObjetWebTMobil(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver = driver;
	}
	
	public void urlAcceso(String url) 
	{
		driver.get(url);
		//busquedaInicial();
	}
	
	public void formularioTabla(ReadExcelFile leer, Properties propiedades,String nomTest,File rutaCarpeta ) throws Exception 
	{		
		
		scrollVertical(rutaCarpeta, 410, 301, 340 ,1090);
		
		click(Table,rutaCarpeta);
		tiempoEspera(3000);
		

		
		click(add, rutaCarpeta);
		tiempoEspera(1000);
		
		
		// CAMPO DE NOMBRE
		tocarPantalla(122, 450);
		tiempoEspera(2000);
		sendkeyandroid(leer, propiedades, nomTest, 1, 2);
		// CAMPO APELLIDO
		tocarPantalla(122, 330);
		sendkeyandroid(leer, propiedades, nomTest, 1, 3);
		tiempoEspera(3000);
		// CAMPO GMAIL
		tocarPantalla(122, 330);
		sendkeyandroid(leer, propiedades, nomTest, 1, 4);
		tiempoEspera(3000);
		// CAMPO EDAD
		tocarPantalla(122, 330);
		sendkeyandroid(leer, propiedades, nomTest, 1, 5);
		tiempoEspera(3000);
		// CAMPO SALARIO
		tocarPantalla(122, 430);
		sendkeyandroid(leer, propiedades, nomTest, 1, 6);
		tiempoEspera(3000);
		// CAMPO DEPARTAMENTO
		tocarPantalla(122, 530);
		sendkeyandroid(leer, propiedades, nomTest, 1, 7);
		tiempoEspera(3000);
		
		// ACEPTAR EN BOTON SUBMIT
		((PressesKey) driver).pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
		tiempoEspera(3000);
		
		tocarPantalla(350,785);
		

		

		
	}
	
	

}
