package myself.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
// @SpringBootApplication
public class SampleController {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World! Girls!!!";
	}

	public static void main(final String[] args) throws Exception {
		SpringApplication.run(SampleController.class, args);
	}
}