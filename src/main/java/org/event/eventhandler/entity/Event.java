package org.event.eventhandler.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String description;
    private String title;
    private String place;
    private LocalDate localDate;
    private int duration;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id",insertable = false,updatable = false)
    private User user;
    @Column(name = "id_user")
    private UUID idUser;



}
