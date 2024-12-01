package com.smart_contact.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CONTACT")
@Getter
@Setter
@RequiredArgsConstructor
public class Contact {

    @Id
    @Column(name = "ID")
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "NIC_NAME")
    private String nicName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "WORK")
    private String work;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "IMAGE")
    private String image;

    @Column(name = "DESCRIPTION", length = 1000)
    private String description;

    @ManyToOne
    private User user;


}
