package priv.cp;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Date;

@RestController
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @PostMapping("/test")
    public Mono<Date> test(){

        logger.debug("current Thread:{}",Thread.currentThread().getId());

        return Mono.create(dateMonoSink -> {

            logger.debug("current Thread:{}",Thread.currentThread().getId());
            dateMonoSink.success( new Date());


        });
    }



}
