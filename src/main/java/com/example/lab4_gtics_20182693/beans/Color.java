package com.example.lab4_gtics_20182693.beans;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "colores")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_color")
    private int id_Color;

    @Column(name = "color", nullable = false)
    private String color;


}
