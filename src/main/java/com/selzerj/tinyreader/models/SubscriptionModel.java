package com.selzerj.tinyreader.models;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.UUID;

@Data
@Accessors(chain = true)
public class SubscriptionModel {

    private UUID subscriptionId;

    private String url;
}
