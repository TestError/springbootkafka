package priv.cp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.util.Date;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Component
public class Register {


    @Bean
    public RouterFunction<ServerResponse> monoRouterFunction() {
        return route(POST("/echo"), serverRequest -> {

            return ServerResponse.ok().body(fromObject(new Date().getTime()));

        });
    }




}
