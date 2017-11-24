package com.arkaces.aces_encoded_listener_bitcoin.subscription_event;

import com.arkaces.aces_encoded_listener_bitcoin.event.EventEntity;
import com.arkaces.aces_encoded_listener_bitcoin.subscription.SubscriptionEntity;
import lombok.Data;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Data
@Entity
@Table(name = "subscription_events")
public class SubscriptionEventEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String status; // new, delivered

    private Integer tries;

    @OneToOne
    private SubscriptionEntity subscriptionEntity;

    @OneToOne
    private EventEntity eventEntity;

    private ZonedDateTime createdAt;
}
