package com.example.connectserver.domain.user.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instagram_id")
    private Long instagramId;

    @Column(name = "instagram_username")
    private String instagramUsername;

    @Column(name = "username")
    private String username;

}
