package contrastsecurity.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

  @RequestMapping("/health")
  public String health() {
    return "healthy";
  }
  
  @RequestMapping("/ping")
  public String ping() {
    return "ping";
  }
  
}