package com.selzerj.tinyreader.core.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.UUID;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
public class Subscription {

    @Id
    @NonNull
    private UUID subscriptionId;
    private String url;

    @CreatedDate
    private Date createdDate;

    public static Subscription newInstance(String url) {
        Subscription instance = new Subscription();
        instance.url = url;
        instance.subscriptionId = UUID.randomUUID();
        return instance;
    }
}
