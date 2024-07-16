package org.event.eventhandler.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Generated;

import java.util.Set;
import java.util.UUID;

@Getter
@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name ="\"user\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String mail;
    private String pic;
    private String password;
    @OneToMany(mappedBy = "\"user\"")
    private Set<Event> event;




}
