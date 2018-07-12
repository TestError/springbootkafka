package priv.cp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.Date;

import static org.springframework.web.reactive.function.BodyInserters.fromFormData;
import static org.springframework.web.reactive.function.BodyInserters.fromObject;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Component
public class Register {

    private static Logger logger = LoggerFactory.getLogger(Register.class);

    @Bean
    public RouterFunction<ServerResponse> monoRouterFunction() {
        return route(POST("/echo"), serverRequest -> {

            serverRequest.bodyToMono(String.class).subscribe(s -> {

                logger.debug("测试:{}",s);
            });


            return ServerResponse.ok().body(Mono.just("1111"),String.class);

        });
    }




}
