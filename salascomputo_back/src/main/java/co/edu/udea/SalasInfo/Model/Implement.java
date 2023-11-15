package co.edu.udea.SalasInfo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "implement")
public class Implement {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "implementId")
    private Integer implementId;

    @Column(name = "implementName")
    private String implementName;

    @Column(name = "state")
    private String state;

    @JsonIgnore
    @ManyToMany(
            targetEntity = Room.class,
            mappedBy = "implementList",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    List<Room> rooms;

}
