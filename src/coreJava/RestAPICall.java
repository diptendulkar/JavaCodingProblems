package coreJava;

import jakarta.json.Json;
import jakarta.json.JsonObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

import static com.sun.management.HotSpotDiagnosticMXBean.ThreadDumpFormat.JSON;

public class RestAPICall {
    public static void main(String[] args)   {

        System.out.println("\nListing HTTP Response using Java 11 HttpClient:");
        try{


            URI url = URI.create("https://jsonmock.hackerrank.com/api/countries/search");
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = (HttpRequest) HttpRequest.newBuilder(url).build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            int resCode = response.statusCode();
            System.out.println("Response Code: " + resCode);

            String responseBody = response.body().toString();

            System.out.println("Response Msg: " + responseBody);
//            Json json = new JsonObject(responseBody);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
