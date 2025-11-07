package ma.emsi.cherqui.tp_rest_graphq.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Centre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String nom;
    String adresse;
    @OneToMany(mappedBy = "centre")
    List<Etudiant> listEtudiants;
}
