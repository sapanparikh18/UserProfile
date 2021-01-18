package UserProfile;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import io.micronaut.http.client.annotation.*;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
public class UserControllerTest {
    User user = new User("Sapan", "password");

    @Inject
    @Client("/")
    RxHttpClient client;

    @Test
    public void should_save_user() {
        Response<User> response = client.toBlocking().retrieve(HttpRequest.POST("/user", user), Response.class);
        User user = response.getBody();
        Assertions.assertThat(response.status).isEqualTo(Status.SUCCESS);
    }
}
