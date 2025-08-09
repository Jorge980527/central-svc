package com.agroflow.service;
import com.agroflow.model.Cosecha;
import com.agroflow.repository.CosechaRepository;
import com.agroflow.event.CosechaEvent;
import org.springframework.stereotype.Service;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import java.time.OffsetDateTime;
import java.util.UUID;

@Service
public class CentralService {
  private final CosechaRepository cosechaRepo;
  private final RabbitTemplate rabbit;

  public CentralService(CosechaRepository cosechaRepo, RabbitTemplate rabbit) {
    this.cosechaRepo = cosechaRepo;
    this.rabbit = rabbit;
  }

  public Cosecha registrarCosecha(Cosecha c) {
    Cosecha saved = cosechaRepo.save(c);
    CosechaEvent ev = new CosechaEvent(UUID.randomUUID(), "nueva_cosecha", OffsetDateTime.now(), saved);
    rabbit.convertAndSend("cosechas", "nueva", ev);
    return saved;
  }
}

