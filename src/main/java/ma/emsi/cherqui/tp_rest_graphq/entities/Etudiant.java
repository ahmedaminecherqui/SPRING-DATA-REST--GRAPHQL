package ma.emsi.cherqui.tp_rest_graphq.entities;

import jakarta.persistence.*;
import lombok.*;
import ma.emsi.cherqui.tp_rest_graphq.enums.Genre;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="etudiants")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nom_etudiant", nullable=false)
    String nom;
    @Column(name="prenom_etudiant")
    String prenom;
    @Enumerated(EnumType.STRING)
    Genre genre;
    @ManyToOne
    @NotNull
    @JoinColumn(name="centre_id")
    Centre centre;
}
