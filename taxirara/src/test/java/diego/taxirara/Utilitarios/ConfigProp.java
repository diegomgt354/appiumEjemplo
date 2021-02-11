package diego.taxirara.Utilitarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class ConfigProp {

	static Properties prop = new Properties();
	static InputStream input = null;

	private static void init() {
		try {
			input = new FileInputStream("C:\\Users\\ROJAS\\workspace\\taxirara\\config.properties");
			try {
				prop.load(input);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static String getRutaExcel() {
		init();
		return prop.getProperty("rutaExcel");
	}
	
	public static String getRutaRaiz(){
		init();
		return prop.getProperty("rutaScreamshop");
	}
	
	public static String getRutaImgClienteLogin(){
		init();
		return prop.getProperty("rutaimgclientelogin");
	}
	
	public static String getRutaImgDriverLogin(){
		init();
		return prop.getProperty("rutaimgconductorlogin");
	}
	
	public static String getRutaImgClienteRegistro(){
		init();
		return prop.getProperty("rutaimgclienteregistro");
	}

	public static String getRutaImgDriverRegistro(){
		init();
		return prop.getProperty("rutaimgconductorregistro");
	}
	
	public static String getRutaImgClienteSolicitaViaje(){
		init();
		return prop.getProperty("rutaimgclientesolicitaviaje");
	}
	
}
