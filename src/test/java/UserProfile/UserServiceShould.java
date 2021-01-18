package UserProfile;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceShould {

    UserService userService;
    User user;
    UserRepository userRepo;

    @BeforeEach
    public void init() {
        user = new User("Sapan", "password");
        userRepo = mock(UserRepository.class);
        userService = new UserService(userRepo);
    }

    @Test
    void save_user_using_repo() {
        userService.save(user);
        verify(userRepo).save(user);
    }
}
