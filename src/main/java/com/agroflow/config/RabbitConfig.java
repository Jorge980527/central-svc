package com.agroflow.config;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
  public static final String EXCHANGE = "cosechas";
  public static final String ROUTING_KEY_NUEVA = "nueva";

  @Bean
  public TopicExchange exchange() { return new TopicExchange(EXCHANGE); }
}
