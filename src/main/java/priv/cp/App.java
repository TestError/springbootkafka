package priv.cp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.util.Date;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {


        SpringApplication.run(App.class, args);
    }

    @Bean
    public RouterFunction<ServerResponse> monoRouterFunction() {
        return route(POST("/echo"), serverRequest -> {

            return ServerResponse.ok().body(fromObject(new Date().getTime()));

        });
    }

}
