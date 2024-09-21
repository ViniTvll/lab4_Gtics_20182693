package com.example.lab4_gtics_20182693.repository;

import com.example.lab4_gtics_20182693.beans.Color;
import com.example.lab4_gtics_20182693.beans.Flor;
import com.example.lab4_gtics_20182693.beans.Ocasion;
import com.example.lab4_gtics_20182693.beans.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlorRepository extends JpaRepository<Flor, Integer> {

    List<Flor> findByColorAndTipoAndOcasion(Color color, Tipo tipo, Ocasion ocasion);

}
