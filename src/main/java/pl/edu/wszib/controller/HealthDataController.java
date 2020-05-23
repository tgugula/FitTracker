package pl.edu.wszib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.wszib.dao.HealthDataDao;
import pl.edu.wszib.domain.HealthData;

@Controller
public class HealthDataController {

    @Autowired
    private HealthDataDao healthDataDao;


    @GetMapping("healthdatas")
    public String healthdatas(Model model) {
        model.addAttribute("healthdatas", healthDataDao.getHealthData());
        return "healthdatas";
    }

    @GetMapping("healthdata")
    public String healthdata() {
        return "healthdata";
    }

    @GetMapping("healthdatas/new")
    public String newHealthData(Model model) {
        model.addAttribute("healthdata", new HealthData());
        return "healthdata";
    }

    @PostMapping("healthdatas/save")
    public String saveHealthData(HealthData healthdata) {
        healthDataDao.saveHealthData(healthdata);
        return "redirect:/healthdatas";
    }

    @GetMapping("healthdatas/edit/{id}")
    public String editHealthData(@PathVariable Long id, Model model) {
        HealthData healthdata = healthDataDao.getById(id);
        model.addAttribute("healthdata", healthdata);
        return "healthdata";
    }

    @GetMapping("healthdatas/remove/{id}")
    public String removeHealthData(@PathVariable Long id) {
        healthDataDao.removeHealthData(id);
        return "redirect:/healthdatas";
    }

}
