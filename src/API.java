import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {
    String key = "1233f8d4f4b66ad01b216eed";
    String api = "https://v6.exchangerate-api.com/v6/%s/latest/USD".formatted(key);

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(api))
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    public API() throws IOException, InterruptedException {
    }

    public String getResponse() {
        return response.body();
    }

    public void getJsonResponse() {
        Gson json = new Gson();
        JsonElement je = json.fromJson(getResponse(), JsonElement.class);
        JsonObject jo = je.getAsJsonObject();
        Moedas moedas = json.fromJson(jo.getAsJsonObject("conversion_rates"), Moedas.class);
        //System.out.println(moedas);
    }
}
