package ma.emsi.cherqui.tp_rest_graphq.repositories;

import ma.emsi.cherqui.tp_rest_graphq.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long>
{
}
