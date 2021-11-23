package Security_Quest.Security_Quest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ShieldController {

        @GetMapping("/")
        public String welcome() {
            return "Welcome to the SHIELD";
        }

        @GetMapping("/avengers/assemble")
        public String heroes() {
            return "Avengers..... Assemble";
        }

        @GetMapping("/secret-bases")
        public String directors() {
            List<String> cities = new ArrayList<>(Arrays.asList("Amsterdam", "Barcelona", "Berlin", "Brüssel", "Bukarest", "Lissabon", "London","Madrid"));
            return cities.toString();
        }
    }

