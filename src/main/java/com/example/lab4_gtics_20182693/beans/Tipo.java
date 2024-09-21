package com.example.lab4_gtics_20182693.beans;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tipos")
public class Tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo")
    private int id_Tipo;

    @Column(name = "tipo", nullable = false)
    private String tipo;


}
