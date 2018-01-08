package ikuwow.todoapp.controller;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.junit.*;
import org.junit.runner.*;
import ikuwow.todoapp.controller.ListController;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ListControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void sampleTest() throws Exception {
        mockMvc.perform(get("/")).andExpect(status().isOk());
    }
}
