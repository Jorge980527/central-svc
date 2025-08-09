package com.agroflow.event;

import com.agroflow.model.Cosecha;
import java.time.OffsetDateTime;
import java.util.UUID;

public class CosechaEvent {
    private UUID eventId;
    private String eventType;
    private OffsetDateTime timestamp;
    private Cosecha payload;

    public CosechaEvent(UUID eventId, String eventType, OffsetDateTime timestamp, Cosecha payload) {
        this.eventId = eventId;
        this.eventType = eventType;
        this.timestamp = timestamp;
        this.payload = payload;
    }

    // Getters y setters
    public UUID getEventId() {
        return eventId;
    }

    public void setEventId(UUID eventId) {
        this.eventId = eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Cosecha getPayload() {
        return payload;
    }

    public void setPayload(Cosecha payload) {
        this.payload = payload;
    }
}
