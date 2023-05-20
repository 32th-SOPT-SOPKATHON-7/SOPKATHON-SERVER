package com.sopt.SopkathonServer.api.station.repository;

import com.sopt.SopkathonServer.api.station.domain.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface StationRepository extends JpaRepository<Station, Long> {
    Optional<Station> findByName(String stationName);
}
