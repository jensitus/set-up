package at.hiber;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "hiber")
public class Hiber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

}
