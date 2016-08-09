

/**
 * Created by Wojt on 2016-08-09.
 */

package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

    @Controller
    public class GreetingController {

        @RequestMapping("/")
        public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
            model.addAttribute("name", name);
            return "greeting";
        }
        @RequestMapping("/fiki")
        public String fiki(@RequestParam(value="name", required=false, defaultValue="Wojt") String name, Model model) {
            model.addAttribute("name", name);
            return "fiki";
        }
        @RequestMapping("/reader")
        public String reader(@RequestParam(value="name", required=false, defaultValue="Wojt") String name, Model model) {
            model.addAttribute("name", name);
            return "reader";
        }


    }

