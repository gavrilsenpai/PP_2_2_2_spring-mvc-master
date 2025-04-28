package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    private final CarService carService = new CarService();

    @GetMapping(produces = "text/html; charset=UTF-8")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count == null) {
            count = 5;
        }
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}

