package pathFinder.pathfinder.Entity;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pathFinder.pathfinder.Entity.enums.Level;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter

@Entity
@Table(name = "routes")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    private String gpxCoordinates;

    @Enumerated(EnumType.STRING)
    private Level level;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    private User author;

    private String videoUrl;

    @OneToMany(targetEntity = Comment.class, mappedBy = "route", cascade = CascadeType.ALL)
    private Set<Comment> comments;

    @OneToMany(mappedBy = "route", fetch = FetchType.EAGER)
    private Set<Picture> pictures;

    @ManyToMany
    private Set<Category> categories;

    public Route() {
        this.comments = new HashSet<>();
        this.categories = new HashSet<>();
    }


}
