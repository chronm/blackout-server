package dev.chronm.blackout.blackoutserver.users;

import dev.chronm.blackout.blackoutserver.users.model.User;
import dev.chronm.blackout.blackoutserver.users.model.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponse findAll() {
        return userService.findAll();
    }

    @GetMapping(value = "/users/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User findUserByUserId(@PathVariable(value = "userId") String userId) {
        return userService.findUserById(userId);
    }

    @PostMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }
}
