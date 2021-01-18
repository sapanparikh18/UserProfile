package UserProfile;

import javax.inject.Singleton;

@Singleton
public class UserRepository {
    public ResponseBody save(User user) {
        ResponseBody responseBody = new ResponseBody();
        responseBody.status = Status.SUCCESS;
        return responseBody;
    }
}
