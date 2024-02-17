package com.example.companyms.company.messaging;

import com.example.companyms.company.CompanyService;
import com.example.companyms.company.dto.ReviewMessage;
import javassist.NotFoundException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class ReviewMessageConsumer {
    public final CompanyService companyService;

    public final RabbitTemplate rabbitTemplate;
    public ReviewMessageConsumer(CompanyService companyService, RabbitTemplate rabbitTemplate){
        this.companyService = companyService;
        this.rabbitTemplate = rabbitTemplate;
    }
    @RabbitListener(queues = "companyRatingQueue")
    public void consumeMessage(ReviewMessage reviewMessage) throws NotFoundException {
        companyService.updateCompanyRating(reviewMessage);
    }
}
