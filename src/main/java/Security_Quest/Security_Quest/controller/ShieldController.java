package Security_Quest.Security_Quest.controller;

import Security_Quest.Security_Quest.entity.CityDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    @GetMapping("/api/secret-bases")
    public List<CityDTO> directors() {
        //List<String> cities = Arrays.asList("Amsterdam", "Barcelona", "Berlin", "Brüssel", "Bukarest", "Lissabon", "London","Madrid");
        List<CityDTO> cities = new ArrayList<>();
        cities.add(new CityDTO("Amsterdam"));
        cities.add(new CityDTO("Barcelona"));

        return cities;

    }

    }

