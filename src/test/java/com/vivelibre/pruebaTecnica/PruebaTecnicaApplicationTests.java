package com.vivelibre.pruebaTecnica;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureWebTestClient
class PruebaTecnicaApplicationTests {
    @Autowired
    ApplicationContext context;
    @Autowired
    private MockMvc mockMvc;


    @Test
    @WithMockUser
    public void basicTestController() throws Exception {
        //para que funcione tiene que estar el servicio externo funcionado.
        mockMvc.perform(MockMvcRequestBuilders.get("/get-token"))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

}
