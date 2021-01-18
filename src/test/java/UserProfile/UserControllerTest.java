package UserProfile;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import io.micronaut.http.client.annotation.*;

import javax.inject.Inject;

@MicronautTest
public class UserControllerTest {
    User user = new User("Sapan", "password");

    @Inject
    @Client("/")
    RxHttpClient client;

    @Test
    public void should_save_user() {
        ResponseBody responseBody = client.toBlocking().retrieve(HttpRequest.POST("/user", user), ResponseBody.class);
        Assertions.assertThat(responseBody.status).isEqualTo(Status.SUCCESS);
    }
}
