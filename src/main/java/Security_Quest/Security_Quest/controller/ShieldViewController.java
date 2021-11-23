package Security_Quest.Security_Quest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ShieldViewController {

    @GetMapping("/secret-bases")
    public String directors(Model model) {
        List<String> cities = Arrays.asList("Amsterdam", "Barcelona", "Berlin", "Brüssel", "Bukarest", "Lissabon", "London","Madrid");
        //Alternative:
        /*List<CityDTO> cities = new ArrayList<>();
        cities.add(new CityDTO("Amsterdam"));
        cities.add(new CityDTO("Barcelona"));*/
        model.addAttribute("cities", cities);
        return "/Cities";
    }
}
