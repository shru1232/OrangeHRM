package reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static String getProperty(String Key) {
		
		String path=System.getProperty("user.dir")+"/src/main/resources/configLayer/config.properties";
		
		try {
			FileInputStream fis=new FileInputStream(path);
			
			Properties prop=new Properties();
			
			prop.load(fis);
			
			return prop.getProperty(Key);
			
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		}catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return null;
	}
	
}
