package br.com.mayor.connection;

import br.com.mayor.models.Converter;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.lang.InterruptedException;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class API {
    public Converter getConverter(String baseCurrencyCode, String targetCurrencyCode, double value) {
        String BASE_URL = "https://v6.exchangerate-api.com/v6/";
        String API_KEY = "Your Key";

        URI endpoint = URI.create(BASE_URL + API_KEY + "/latest/" + baseCurrencyCode);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endpoint)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                JsonObject jsonResponse = new Gson().fromJson(response.body(), JsonObject.class);
                JsonObject conversionRates = jsonResponse.getAsJsonObject("conversion_rates");
                double conversionRate = conversionRates.getAsJsonPrimitive(targetCurrencyCode).getAsDouble();
                return new Converter(baseCurrencyCode, targetCurrencyCode, conversionRate);
            } else {
                throw new RuntimeException("Falha ao realizar cotação: " + response.statusCode() + " - " + response.body());
            }
        } catch (IOException | InterruptedException | JsonSyntaxException e) {
            throw new RuntimeException("Falha ao realizar cotação: " + e.getMessage());
        }
    }
}