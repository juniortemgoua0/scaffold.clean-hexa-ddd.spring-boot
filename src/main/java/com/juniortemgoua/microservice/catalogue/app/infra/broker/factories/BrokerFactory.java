package com.juniortemgoua.microservice.catalogue.app.infra.broker.factories;

import com.juniortemgoua.microservice.catalogue.app.core.broker.BrokerInterface;
import com.juniortemgoua.microservice.catalogue.app.infra.broker.kafka.Kafka;
import com.juniortemgoua.microservice.catalogue.app.infra.broker.rabbitmq.RabbitMq;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * .
 */
@Configuration
public class BrokerFactory {

  @Value("app.prod.broker") String selectedBroker;

  @Bean("Broker")
  public BrokerInterface createBroker() {
    if(selectedBroker.equalsIgnoreCase("rabbit-mq")){
      return new RabbitMq();
    }
    return  new Kafka();
  }
}