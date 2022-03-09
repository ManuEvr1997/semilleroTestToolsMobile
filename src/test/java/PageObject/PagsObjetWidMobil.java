package PageObject;

import java.io.File;
import java.util.Properties;
import MapObject.MapsObjectWidtMobil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utilidadesExcel.ReadExcelFile;

public class PagsObjetWidMobil extends MapsObjectWidtMobil

{

	public PagsObjetWidMobil(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void SelecBarraWidged(ReadExcelFile leer, Properties propiedades,String nomTest,File rutaCarpeta ) throws Exception {

		scrollVertical1(rutaCarpeta, 330, 930, 430, 1);
		scrollVertical1(rutaCarpeta, 300, 170, 1030,2);
		//tocarPantalla(350,290);
		
		click(widget,rutaCarpeta);
		tiempoEspera(3000);
		
		scrollVertical(rutaCarpeta, 278, 220, 278, 810);
		
		click(dataPicker,rutaCarpeta);
		tiempoEspera(3000);
		
		//Date Time
		
		controla(selectdate,rutaCarpeta);
		tiempoEspera(3000);
		
		teclaborrar(selectdate, rutaCarpeta);
		
		sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,9),selectdate,rutaCarpeta);
		
		
		click(dateMonthDateHour, rutaCarpeta);
		tiempoEspera(3000);
		
		controla(dateMonthDateHour,rutaCarpeta);
		tiempoEspera(3000);
		
		teclaborrar(dateMonthDateHour, rutaCarpeta);
		
		String datos = (leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,10)+","+(leer.getCellValue(propiedades.getProperty("PathExcel"),"datos",1,11)));
		
		sendkey(datos,dateMonthDateHour, rutaCarpeta);
		
		scrollVertical1(rutaCarpeta, 340, 180, 1110, 2);

	}

}
