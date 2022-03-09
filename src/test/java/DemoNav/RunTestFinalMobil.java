package DemoNav;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import PageObject.PagsObjectElementsMobil;
import PageObject.PagsObjetAlertsMobil;
import PageObject.PagsObjetWebTMobil;
import PageObject.PagsObjetWidMobil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utilidadesExcel.ReadExcelFile;
import utilidadesExcel.WriteExcelFile;

public class RunTestFinalMobil {

	private AppiumDriver<MobileElement> driver;
	Properties propiedades;
	ReadExcelFile leer;
	WriteExcelFile escribir;
	PagsObjectElementsMobil selecObject;
	PagsObjetWidMobil selectObjetWidged;
	String url = null;
	PagsObjetWebTMobil paginas;
	PagsObjetAlertsMobil paginasPp;
	ClaseBaseFinalMobil claseBase;

	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws InterruptedException, IOException {

		driver = ClaseBaseFinalMobil.AppiumDriverConnection();

		// ACCESOS PORTABLES DEL NAVEGADOR
		
		//selectObjetWidged = new PagsObjetWid(driver);
		

		// INSTANCIAR LA CLASE PROPIEDADES DE JAVA UNIT
		propiedades = new Properties();
		paginas = new PagsObjetWebTMobil(driver);
		paginasPp = new PagsObjetAlertsMobil(driver);
		selecObject = new PagsObjectElementsMobil(driver);  
		selectObjetWidged = new PagsObjetWidMobil(driver);
		

		// INSTANCIAR CLASES DE EXCEL
		leer = new ReadExcelFile();
		escribir = new WriteExcelFile();

		// CREAR LA VARIABLE TIPO INPUTSTRING
		InputStream entrada = null;

		// VALIDAR SI GENERA ERROR AL NO ENCONTRAR EL ARCHIVO
		try {
			entrada = new FileInputStream("./Properties/datos.properties");
			propiedades.load(entrada);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
			// TODO: handle exception
		}

	}

	@Test
	public void TestToolsQA() throws Exception {	
			
			claseBase = new ClaseBaseFinalMobil(driver);
			// OBTENER EL NOMBRE DEL METODO A EJECUTAR
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

			// CREAR CARPETA PARA EL ALMACENAMIENTO DE IMAGENES
			File rutaCarpeta = claseBase.crearCarpeta(propiedades, nomTest); 

			selecObject.seleccionElements(leer, propiedades, "datos", rutaCarpeta);
			
			paginas.formularioTabla(leer, propiedades, "datos", rutaCarpeta);
			
			selecObject.selecDelete(rutaCarpeta);

			selectObjetWidged.SelecBarraWidged(leer, propiedades, "datos", rutaCarpeta);
			
			paginasPp.findAlerts(leer, propiedades, "datos", rutaCarpeta);

	}

	@After
	public void cerrar() {
		driver.close();
	}

}

	

