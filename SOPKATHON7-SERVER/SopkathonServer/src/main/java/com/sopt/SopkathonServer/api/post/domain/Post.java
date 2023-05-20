package com.sopt.SopkathonServer.api.post.domain;

import com.sopt.SopkathonServer.api.station.domain.Station;
import com.sopt.SopkathonServer.common.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "posts")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "station_id", nullable = false)
    private Station station;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Integer likeCnt;

    @Builder
    public Post(Station station, String title, String content, Integer likeCnt) {
        this.station = station;
        this.title = title;
        this.content = content;
        this.likeCnt = likeCnt;
        this.station.addPost(this);
    }
}
