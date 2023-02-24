package com.selzerj.tinyreader.controllers;

import com.selzerj.tinyreader.core.services.SubscriptionService;
import com.selzerj.tinyreader.models.SubscriptionModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/subscriptions")
@RequiredArgsConstructor
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    @PostMapping()
    public SubscriptionModel createSubscription(@RequestBody SubscriptionModel subscription) {
        return subscriptionService.createSubscription(subscription);
    }

    @GetMapping("{subscriptionId}")
    public SubscriptionModel getSubscription(@PathVariable UUID subscriptionId) {
        return subscriptionService.getSubscription(subscriptionId);
    }
}
