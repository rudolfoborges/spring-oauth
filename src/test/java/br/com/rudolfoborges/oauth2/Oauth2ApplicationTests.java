package br.com.rudolfoborges.oauth2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Oauth2Application.class)
@WebAppConfiguration
public class Oauth2ApplicationTests {

	@Test
	public void contextLoads() {
	}

}