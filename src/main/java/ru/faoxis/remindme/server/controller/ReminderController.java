package ru.faoxis.remindme.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sergei on 8/19/16.
 */

@Controller
@RequestMapping("/remind")
public class ReminderController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody // в виде тела ответа строка
    public String getReminder(ModelMap model) {
        return "My reminder";
    }
    
}
