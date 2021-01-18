package UserProfile;

import io.micronaut.http.annotation.*;

@Controller("/user")
public class UserController {


    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Post()
    public Response save(@Body User user) {
        return userService.save(user);
    }
}
