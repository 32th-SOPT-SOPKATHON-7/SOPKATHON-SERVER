package com.sopt.SopkathonServer.api.station.repository;

import com.sopt.SopkathonServer.api.station.domain.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.List;

public interface StationRepository extends JpaRepository<Station, Long> {
    Optional<Station> findByName(String stationName);

    @Query("SELECT s FROM Station s JOIN s.posts p GROUP BY s HAVING SUM(p.likeCnt) > 10")
    List<Station> findAllWithTotalLikesGreaterThanTen();

}
