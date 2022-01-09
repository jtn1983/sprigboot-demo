package ru.tenilin.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tenilin.springdemo.profile.SystemProfile;

@RestController
@RequestMapping("/")
public class ProfileController {
    private SystemProfile systemProfile;

    public ProfileController(SystemProfile profile) {
        this.systemProfile = profile;
    }

    @GetMapping("profile")
    public String getProfile() {
        return systemProfile.getProfile();
    }

}
