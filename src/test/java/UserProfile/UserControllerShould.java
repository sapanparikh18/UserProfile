package UserProfile;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserControllerShould {
    User user = new User("Sapan", "password");
    UserController userController;
    UserService userService;

    @BeforeEach
    public void init() {
        userService = mock(UserService.class);
        userController = new UserController(userService);
    }

    @Test
    public void should_redirect_user_to_user_service() {
        userController.save(user);
        verify(userService).save(user);
    }
}
