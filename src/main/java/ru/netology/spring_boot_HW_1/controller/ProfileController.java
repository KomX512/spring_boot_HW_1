package ru.netology.spring_boot_HW_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.spring_boot_HW_1.profile.SystemProfile;

@RestController
@RequestMapping("/")
public class ProfileController {
    private SystemProfile profile;

    public ProfileController (SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("profile")
    public String getProfile () {
        return profile.getProfile();
    }

//    @GetMapping("")
//    public String getEmpty() {
//        return "empty";
//    }
}