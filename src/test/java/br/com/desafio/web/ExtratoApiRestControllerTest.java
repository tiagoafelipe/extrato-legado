package br.com.desafio.web;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import br.com.tf.desafio.main.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class ExtratoApiRestControllerTest {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mvc;

    @Before
    public void setUp() {
        this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
    }

    @Test
    public void testGetExtratoApi() throws Exception {
    
    	 mvc.perform(get("/extrato"))
                 .andExpect(status().isOk())
                 .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                 .andExpect(jsonPath("$", hasSize(2)))
                 .andExpect(jsonPath("$[0].numeroEvento", is(42236790)))
                 .andExpect(jsonPath("$[0].dataLancamento", is("03/06/2016")))
                 .andExpect(jsonPath("$[0].situacao", is("Pago")))
                 .andExpect(jsonPath("$[1].numeroEvento", is(42592397)))
                 .andExpect(jsonPath("$[1].dataLancamento", is("02/06/2016")))
                 .andExpect(jsonPath("$[1].situacao", is("Pago")));
    }
    
}
