package jsz.dk.huihua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HuahuiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuahuiApplication.class, args);
    }

}
