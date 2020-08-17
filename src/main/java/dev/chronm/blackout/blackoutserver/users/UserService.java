package dev.chronm.blackout.blackoutserver.users;

import dev.chronm.blackout.blackoutserver.database.UserDao;
import dev.chronm.blackout.blackoutserver.repository.UserRepository;
import dev.chronm.blackout.blackoutserver.users.model.User;
import dev.chronm.blackout.blackoutserver.users.model.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponse findAll() {
        return new UserResponse(userRepository.findAll().stream().map(UserDao::toUser).collect(Collectors.toList()));
    }

    public User findUserById(String userId) {
        return userRepository.findUserById(userId).toUser();
    }

    public void saveUser(User user) {
        userRepository.save(new UserDao(user));
    }
}
