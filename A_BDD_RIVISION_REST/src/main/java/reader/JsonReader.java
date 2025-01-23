package reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.T;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReader {
	
	public static <T>T deserialization(Class<T> classname,String jsonPayloadFileName) {
		
		ObjectMapper mapper=new ObjectMapper();
		
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\jsonPayload\\"+jsonPayloadFileName+".json";
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(path);
			
			JsonNode json=mapper.readTree(fis);
			
			return mapper.treeToValue(json.get(""),classname);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		return null;
		
	}
	
	public static Object serialization(Class<T> classname) {
		
		ObjectMapper mapper=new ObjectMapper();
		
		try {
			return mapper.writeValueAsString(classname);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
