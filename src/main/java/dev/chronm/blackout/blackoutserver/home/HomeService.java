package dev.chronm.blackout.blackoutserver.home;

import dev.chronm.blackout.blackoutserver.database.HomeDao;
import dev.chronm.blackout.blackoutserver.home.model.Home;
import dev.chronm.blackout.blackoutserver.repository.HomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HomeService {

    private final HomeRepository homeRepository;

    public Home getHome() {
        return homeRepository.findTop1By().toHome();
    }

    public void saveHome(Home home) {
        homeRepository.save(new HomeDao(home));
    }
}
