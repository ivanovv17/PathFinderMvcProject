package pathFinder.pathfinder.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pathFinder.pathfinder.Entity.enums.RouteCategory;

@Getter
@Setter
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    private RouteCategory name;

    @Column(columnDefinition = "TEXT")
    private String description;

    public Category() {}

}
