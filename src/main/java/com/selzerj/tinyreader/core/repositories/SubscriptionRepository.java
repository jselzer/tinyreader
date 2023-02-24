package com.selzerj.tinyreader.core.repositories;

import com.selzerj.tinyreader.core.entities.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SubscriptionRepository extends JpaRepository<Subscription, UUID> {
}
