package priv.cp;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {


    @PostMapping("/test")
    public Date test(){
        return new Date();
    }



}
