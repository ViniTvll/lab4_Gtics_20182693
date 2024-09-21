package com.example.lab4_gtics_20182693.beans;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "flores")
public class Flor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_flor")
    private int id_Flor;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "imagen", nullable = false)
    private String imagen;

    @Column(name = "precio", nullable = false)
    private double precio;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;


    @ManyToOne
    @JoinColumn(name = "id_color")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "id_ocasion")
    private Ocasion ocasion;


}
