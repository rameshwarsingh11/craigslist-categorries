package sample;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc

/**
 * 
 * @author Rameshwar. TestClass to test default category search
 */
public class CategoryBootTest {

	@Autowired
	private MockMvc mvc;

	@Test
	/**
	 * Test getCategorySearch. Comparing contents to that of a sample json.
	 * 
	 * @throws Exception
	 */
	public void getCategorySearch() throws Exception {
		mvc.perform((RequestBuilder) ((ResultActions) MockMvcRequestBuilders.get("/categories"))
				.andExpect(status().isOk()).andExpect(content().json("./categories.json")));
	}
}