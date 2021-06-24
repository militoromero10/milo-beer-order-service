package com.milo.ms.services.testcomponents;

import com.milo.brewery.model.events.ValidateOrderRequest;
import com.milo.brewery.model.events.ValidateOrderResult;
import com.milo.ms.config.JmsConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class BeerOrderValidationListener {
    private final JmsTemplate jmsTemplate;

    @JmsListener(destination = JmsConfig.VALIDATE_ORDER_QUEUE)
    public void list(Message msg){

        ValidateOrderRequest request = (ValidateOrderRequest) msg.getPayload();

        System.out.println("########### I RAN ########");

        jmsTemplate.convertAndSend(JmsConfig.VALIDATE_ORDER_RESPONSE_QUEUE,
                ValidateOrderResult.builder()
                        .isValid(true)
                        .orderId(request.getBeerOrder().getId())
                        .build());

    }
}