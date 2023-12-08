package com.example.airflowapi.repository;

import com.example.airflowapi.model.ViewMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewMenuRepository extends JpaRepository<ViewMenu, Integer> {
    ViewMenu findByName(String name);
}
