package com.vivelibre.pruebaTecnica.controller;

import com.vivelibre.pruebaTecnica.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerService {

    @Autowired
    private ItemService itemService;
    @GetMapping("/get-token")
    public String getToken(){
        return itemService.getToken();
    }

}
