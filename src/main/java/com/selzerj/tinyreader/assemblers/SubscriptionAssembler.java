package com.selzerj.tinyreader.assemblers;

import com.selzerj.tinyreader.core.entities.Subscription;
import com.selzerj.tinyreader.models.SubscriptionModel;
import lombok.experimental.UtilityClass;
import org.springframework.stereotype.Component;

@UtilityClass
public class SubscriptionAssembler {

    public SubscriptionModel assemble(Subscription subscription) {
        return new SubscriptionModel()
                .setSubscriptionId(subscription.getSubscriptionId())
                .setUrl(subscription.getUrl());
    }

    public Subscription disassemble(SubscriptionModel subscriptionModel) {
        return Subscription.newInstance(subscriptionModel.getUrl());
    }
}
