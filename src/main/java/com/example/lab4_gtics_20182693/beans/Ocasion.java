package com.example.lab4_gtics_20182693.beans;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "ocasiones")
public class Ocasion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ocasion")
    private int id_Ocasion;

    @Column(name = "ocasion", nullable = false)
    private String ocasion;


}
