package main.com.myApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.Period;

@Controller
public class HomeController
{

    @RequestMapping("/")
    public String showHomePage()
    {        //business logic@
        return "home";
    }

    @RequestMapping("/processForm")
    public String processForm(
            @RequestParam("yearKey") String year,
            @RequestParam("monthKey") String month,
            @RequestParam("dayKey") String day,
            Model model)
        {
           Period userAge = calculateAge(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
           model.addAttribute("years", userAge.getYears());
           model.addAttribute("months", userAge.getMonths());
           model.addAttribute("days", userAge.getDays());
           return "result";
        }

        private Period calculateAge(int year, int month, int day) {

            LocalDate dateOfBirth = LocalDate.of(year, month, day);
            LocalDate currentDate = LocalDate.now();

            return Period.between(dateOfBirth, currentDate);
        }
}
