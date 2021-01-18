package UserProfile;

import javax.inject.Singleton;

@Singleton
public class UserRepository {
    public Response save(User user) {
        Response response = new Response(user);
        response.status = Status.SUCCESS;
        return response;
    }
}
