package com.example.lab4_gtics_20182693.repository;

import com.example.lab4_gtics_20182693.beans.Flor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ColorRepository extends JpaRepository<Flor, Integer> {

}
