package com.selzerj.tinyreader.core.services;

import com.selzerj.tinyreader.assemblers.SubscriptionAssembler;
import com.selzerj.tinyreader.core.entities.Subscription;
import com.selzerj.tinyreader.core.repositories.SubscriptionRepository;
import com.selzerj.tinyreader.models.SubscriptionModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class SubscriptionService {

    private final SubscriptionRepository subscriptionRepository;

    public SubscriptionModel createSubscription(SubscriptionModel subscriptionModel) {
        log.info("Subscribing to %s - just kidding!".formatted(subscriptionModel.getUrl()));
        // FIXME, validation

        Subscription subscription = SubscriptionAssembler.disassemble(subscriptionModel);
        return SubscriptionAssembler.assemble(subscriptionRepository.save(subscription));
    }

    public SubscriptionModel getSubscription(UUID subscriptionId) {
        return SubscriptionAssembler.assemble(subscriptionRepository.getReferenceById(subscriptionId));
    }
}
