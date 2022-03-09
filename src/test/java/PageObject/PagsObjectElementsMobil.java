package PageObject;

import java.io.File;
import java.util.Properties;

import MapObject.MapsObjetElementsMobil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utilidadesExcel.ReadExcelFile;

public class PagsObjectElementsMobil extends MapsObjetElementsMobil
{
		public PagsObjectElementsMobil(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	
	public void urlAcceso(String url) 
	{
		driver.get(url);
	}
	
	
	public void seleccionElements(ReadExcelFile leer, Properties propiedades, String nomTest, File rutaCarpeta) throws Exception
		{

			
			click(SearchBar, rutaCarpeta);
			tiempoEspera(3000);
			sendkey(leer.getCellValue(propiedades.getProperty("PathExcel"), "datos", 1, 1), SearchBar,rutaCarpeta);     
			tiempoEspera(3000);
			click(selecVinculo,rutaCarpeta);
			scrollVertical(rutaCarpeta, 362, 1110, 362, 280);
			click(btnElement,rutaCarpeta);
			tiempoEspera(3000);
			
			scrollVertical(rutaCarpeta, 340, 231, 340 ,1140);

			

			
		//	tiempoEspera(3000);
		
		

		
		
		}

	
	public void selecDelete( File rutaCarpeta) throws Exception
	{
		//click(cuadroEliminar ,rutaCarpeta);
		tocarPantalla(369, 707);
		scrollHorizontal(rutaCarpeta, 77, 707, 500, 707, 1);
		
		click(Delete, rutaCarpeta);
		tiempoEspera(3000);
		
	} 
	

}
