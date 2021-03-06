package UserProfile;

import javax.inject.Singleton;

@Singleton
public class UserService {
    private UserRepository userRepo;

    public UserService(UserRepository userRepo) {

        this.userRepo = userRepo;
    }

    public ResponseBody save(User user) {
        return userRepo.save(user);
    }
}
