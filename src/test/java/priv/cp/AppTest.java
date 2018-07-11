package priv.cp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

//        var test = Mono.just()

        Mono.just("qqq").subscribe(System.out::println);

        Flux.just(1,2,3,4,5).subscribe(System.out::println);

    }
}
