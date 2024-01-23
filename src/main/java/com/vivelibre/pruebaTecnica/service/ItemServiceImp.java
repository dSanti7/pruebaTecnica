package com.vivelibre.pruebaTecnica.service;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Service
public class ItemServiceImp implements ItemService {


    @Override

    public String getToken() {
        //Configuración de ruta
        WebClient client = WebClient.builder()
                //.baseUrl("http://localhost:8080") configuración sin docker
                .baseUrl("http://getToken:8080")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();

        //Valores del body
        Map<String, String> map = new HashMap<>();
        map.put("username", "auth-vivelibre");
        map.put("password", "password");

        //Definimos el tipo de llamada
        Mono<String> responseMono = client.post()
                .uri("/token")
                .bodyValue(map)
                .retrieve()
                .bodyToMono(String.class);


        return responseMono.block();
    }
}
