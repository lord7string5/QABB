package configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import java.io.InputStream;

public class Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using Inputstream
		InputStream input = null;
		
		//in the same package
		input = Config.class.getResourceAsStream("config.properties");
		//below works outside static context
		//input = this.getClass().getResourceAsStream("config.properties");
		
		//another using class loader
		input = Config.class.getClassLoader().getResourceAsStream("configuration/config.properties");
		
		Properties prop1 = new Properties();
		
		try {
			prop1.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String username1 = prop1.getProperty("username");
		String password1 = prop1.getProperty("password");
		System.out.println(username1);
		System.out.println(password1);
		
		
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("D:\\Adhikari\\Documents\\WS\\Eclipse\\Aug13JavaProject\\src\\configuration\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		
		try {
			prop.load(fileReader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		System.out.println(username);
		System.out.println(password);
		
		
	}

}
