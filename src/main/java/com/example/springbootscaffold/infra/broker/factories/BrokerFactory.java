package com.example.springbootscaffold.infra.broker.factories;

import com.example.springbootscaffold.core.ports.broker.IBroker;
import com.example.springbootscaffold.infra.broker.kafka.Kafka;
import com.example.springbootscaffold.infra.broker.rabbitmq.RabbitMq;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * .
 */
@Configuration
public class BrokerFactory {

  @Value("spring.selected.broker") String selectedBroker;

  @Bean("Broker")
  public IBroker createBroker() {
    if(selectedBroker.equalsIgnoreCase("rabbit-mq")){
      return new RabbitMq();
    }
    return  new Kafka();
  }
}