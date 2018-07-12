package priv.cp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.MonoSink;

import java.util.concurrent.Callable;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

/**
 * Unit test for simple App.
 */
public class AppTest 
{



    @Test
    public void shouldAnswerWithTrue()
    {




//        Flow.Subscriber subscriber = publisher;

//        var test = Mono.just()



        Callable<String> stringCallable = () -> {

            return "hell";

        };




        Mono<String> stringMono = Mono.fromCallable(stringCallable);
//        Mono<String> stringMono = Mono.create(stringMonoSink -> {
//
//            stringMonoSink.success("坑坑的");
//
//        });

        stringMono.subscribe(System.out::println);

//        Flux.just(1,2,3,4,5).subscribe(System.out::println);

    }
}
