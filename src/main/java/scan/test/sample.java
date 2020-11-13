package scan.test;
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class sample {

	public static void main(String[] args) throws IOException {
	
     CloseableHttpClient httpCl = HttpClients.createDefault();

     try {

         HttpGet request = new HttpGet("https://sascsmple/get");

         CloseableHttpResponse response = httpCl.execute(request);

         try {

        
             HttpEntity entity = response.getEntity();
             if (entity != null) {
                
                 String result = EntityUtils.toString(entity);
                 System.out.println(result);
             }

         } finally {
             response.close();
         }
     } finally {
    	 httpCl.close();
     }
     
     
     
	}

}
