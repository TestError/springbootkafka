package priv.cp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseCookie;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Component
public class Register {


    @Bean
    public RouterFunction<ServerResponse> monoRouterFunction() {
        return route(POST("/echo"), serverRequest -> {

//            ServerResponse serverResponse = ServerResponse.BodyBuilder

//            return serverResponse;
            return ServerResponse.ok().body(fromObject(new Date().getTime()));

        });
    }




}
