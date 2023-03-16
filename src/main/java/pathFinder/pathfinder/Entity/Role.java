package pathFinder.pathfinder.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pathFinder.pathfinder.Entity.enums.UserRoles;

@Getter
@Setter
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private UserRoles name;

    public Role() {}


}
