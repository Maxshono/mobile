
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.DrbgParameters.NextBytes;

import javax.management.InvalidApplicationException;

public class Httpurlconnectionexample {

	
	
	
	public void GetMethod() throws IOException {
		
		URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");
	HttpURLConnection connection=(HttpURLConnection) url.openConnection();
	connection.setRequestMethod("GET");
	connection.connect();
int Statucode=	connection.getResponseCode();
String message = connection.getResponseMessage();

System.out.println("Status Code is "+Statucode);
System.out.println("Response Message is "+message);

      InputStream inputStream=connection.getInputStream();
      InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
      String line;
      StringBuffer buffer = new StringBuffer();
     while((line= bufferedReader.readLine())!=null) {
    	buffer.append(line);
     }
     System.out.println(buffer);	 
	}
	
	
	public void PutMethod() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/api/v1/update/1650");
	HttpURLConnection connection=	(HttpURLConnection) url.openConnection();
	
	
	
	
	
	
	
	
	}
	
	
	public void PostMethod() throws IOException {
		
		
		URL url = new URL("	https://dummy.restapiexample.com/api/v1/create");
	HttpURLConnection connection=	(HttpURLConnection) url.openConnection();
connection.setRequestMethod("POST");
connection.setRequestProperty("Content-Type","application/json");
connection.setDoOutput(true);
String jsonbody="{\"name\":\"maxshono\",\"salary\":\"123\",\"age\":\"23\"}";
 byte[] inputjson=jsonbody.getBytes();
 OutputStream outputStream = connection.getOutputStream();
 outputStream.write(inputjson);
 System.out.println("Response code "+connection.getResponseCode());
 System.out.println("Response code "+connection.getResponseMessage());
 
InputStream inputStream = connection.getInputStream();
InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

StringBuffer buffer = new StringBuffer();
String line;

while ((line=bufferedReader.readLine())!=null) {
	buffer.append(line);
	
	
}
 
	System.out.println(buffer);
	

		
	
	}
	
	
	
	public void putmethod() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/api/v1/update/1605");
		 HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		 connection.setRequestMethod("PUT");
		 connection.setDoOutput(true);
		 String jsonbody="{\"name\":\"maxshono\",\"salary\":\"123000\",\"age\":\"19\"}";
		
	byte[] inputjson=	jsonbody.getBytes();
OutputStream outputStream=	 connection.getOutputStream();
outputStream.write(inputjson);
System.out.println("Response code "+connection.getResponseCode());
System.out.println("Response code "+connection.getResponseMessage());

      InputStream inputStream=connection.getInputStream();
      InputStreamReader inputStreamReader= new InputStreamReader(inputStream);
      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
      StringBuffer buffer = new StringBuffer();
      String line;
      while((line=bufferedReader.readLine())!=null) {
    	  buffer.append(line);
    	  
      }

	System.out.println(buffer);	
	}
	
	
	
	public void Deleterequest() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/api/v1/delete/1605");

HttpURLConnection connection =	(HttpURLConnection) url.openConnection();
connection.setRequestMethod("DELETE");
connection.setDoOutput(true);
	
System.out.println("Response code "+connection.getResponseCode());
System.out.println("Response code "+connection.getResponseMessage());

      InputStream inputStream=connection.getInputStream();
      InputStreamReader inputStreamReader= new InputStreamReader(inputStream);
      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
      StringBuffer buffer = new StringBuffer();
      String line;
      while((line=bufferedReader.readLine())!=null) {
    	  buffer.append(line);
    	  
      }

	System.out.println(buffer);	
	}
	
	

	
	
	public static void main(String[] args) throws IOException {
		Httpurlconnectionexample httpurlconnectionexample = new Httpurlconnectionexample();
		httpurlconnectionexample.Deleterequest();
		
		
		
		

	}

}
