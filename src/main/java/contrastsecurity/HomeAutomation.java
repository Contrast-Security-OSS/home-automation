package contrastsecurity;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class HomeAutomation {

  public static void main(String[] args) {
    new SpringApplicationBuilder(HomeAutomation.class).run(args);
  }

}