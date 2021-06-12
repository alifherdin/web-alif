package alif.web.webalif;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;


@Controller
public class HomeController {
    @GetMapping("/")
	public String home() {
		return "home/index";
	}
}
