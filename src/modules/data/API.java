package modules.data;

import com.google.gson.*;
import modules.classes.ConversorMoedas;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {
    String key = "1233f8d4f4b66ad01b216eed";
    String api = "https://v6.exchangerate-api.com/v6/%s/latest/USD".formatted(key);
    ConversorMoedas moedas;

    public API() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(api))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        Gson json = new Gson();
        JsonElement jsonElement = json.fromJson(response.body(), JsonElement.class);
        JsonObject jsonObject = jsonElement.getAsJsonObject();
         moedas = new ConversorMoedas(json.fromJson(jsonObject.getAsJsonObject("conversion_rates"), Moedas.class));
        System.out.println(moedas);
    }

    public ConversorMoedas getMoeda() {
        return this.moedas;
    }

}
