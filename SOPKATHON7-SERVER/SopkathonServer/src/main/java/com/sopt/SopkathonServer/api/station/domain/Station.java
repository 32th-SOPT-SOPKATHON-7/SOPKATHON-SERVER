package com.sopt.SopkathonServer.api.station.domain;

import com.sopt.SopkathonServer.api.post.domain.Post;
import com.sopt.SopkathonServer.common.domain.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Table(name = "stations")
@NoArgsConstructor(access = PROTECTED)
public class Station extends BaseEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id ;

    @Column(nullable = false)
    private String line;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String code;

    @Column
    private Double lat;

    @Column
    private Double lng;

    @OneToMany(mappedBy = "station")
    private List<Post> posts = new ArrayList<>();

    @Builder
    public Station(String line, String name, String code, Double lat, Double lng) {
        this.line = line;
        this.name = name;
        this.code = code;
        this.lat = lat;
        this.lng = lng;
    }

    public int calTotalLikeCnt() {
        int result = 0;
        for (Post post : posts) {
            result += post.getLikeCnt();
        }
        return result;
    }

    public void addPost(Post post) { posts.add(post); }
}
