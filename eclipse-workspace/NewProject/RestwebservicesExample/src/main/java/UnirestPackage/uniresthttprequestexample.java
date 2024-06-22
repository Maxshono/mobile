package UnirestPackage;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class uniresthttprequestexample {
	
	
	
	public void GetrequestExample() {
		
HttpResponse<JsonNode> jsonresponse=		Unirest.get("https://dummy.restapiexample.com/api/v1/employees").asJson();
		

System.out.println("Status code "+jsonresponse.getStatus());
System.out.println("Status message "+jsonresponse.getStatusText());
System.out.println("Status body "+jsonresponse.getBody());

	}
	
	
	public void Postrequest() {
		HttpResponse<JsonNode> jsonresponse=Unirest.post("https://dummy.restapiexample.com/api/v1/create").body("{\"name\":\"maxsholo\",\"salary\":\"123\",\"age\":\"01\"}").asJson();
	

System.out.println("Status code "+jsonresponse.getStatus());
System.out.println("Status message "+jsonresponse.getStatusText());
System.out.println("Status body "+jsonresponse.getBody());

	}

	
	public void Putrequest() {
		HttpResponse<JsonNode> jsonresponse=Unirest.put("https://dummy.restapiexample.com/api/v1/update/1483").body("{\"name\":\"maxsholoo\",\"salary\":\"123678\",\"age\":\"011\"}").asJson();
	

System.out.println("Status code "+jsonresponse.getStatus());
System.out.println("Status message "+jsonresponse.getStatusText());
System.out.println("Status body "+jsonresponse.getBody());

	}
	
	public void Deleterequest() {
	HttpResponse<JsonNode> jsonresponse=	Unirest.delete("https://dummy.restapiexample.com/api/v1/delete/1483").asJson();
		System.out.println("Status code "+jsonresponse.getStatus());
		System.out.println("Status message "+jsonresponse.getStatusText());
		System.out.println("Status body "+jsonresponse.getBody());
	}

	public static void main(String[] args) {
		  uniresthttprequestexample uniresthttprequestexample = new uniresthttprequestexample();
		//  uniresthttprequestexample.GetrequestExample();
		 // uniresthttprequestexample.Postrequest();
		//  uniresthttprequestexample.Putrequest();
		  uniresthttprequestexample.Deleterequest();

	}

}
