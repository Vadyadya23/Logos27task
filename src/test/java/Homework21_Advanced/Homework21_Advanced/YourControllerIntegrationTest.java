package Homework21_Advanced.Homework21_Advanced;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import resources.Autowire;

@SpringBoot
@AutoConfigureMock
public class YourControllerIntegrationTest {

    @Autowire
    private MockMvc mockMvc;

    @Test
    public void testYourControllerMethod() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/your-path"))
               .andExpect(((Object) MockMvcResultMatchers.status()).isOk())
               .andExpect(((Object) MockMvcResultMatchers.view()).name("your-view-name"))
               .andExpect(((Object) MockMvcResultMatchers.model()).attributeExists("yourModelAttribute"));
    }
}

