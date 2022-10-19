package ua.lviv.iot.lab4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.lviv.iot.lab4.view.MyView;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private MyView view;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        //TODO
        //view.show();
    }
}
