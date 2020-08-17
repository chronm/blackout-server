package dev.chronm.blackout.blackoutserver.home;

import dev.chronm.blackout.blackoutserver.home.model.Home;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @GetMapping(value = "home", produces = MediaType.APPLICATION_JSON_VALUE)
    public Home getHome() {
        return homeService.getHome();
    }

    @PostMapping(value = "home", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveHome(@RequestBody Home home) {
        homeService.saveHome(home);
    }
}
