package ma.emsi.cherqui.tp_rest_graphq.dtos;

import jakarta.persistence.*;
import ma.emsi.cherqui.tp_rest_graphq.entities.Centre;
import ma.emsi.cherqui.tp_rest_graphq.enums.Genre;
import org.antlr.v4.runtime.misc.NotNull;

public record EtudiantDTO (
        String nom,
        String prenom,
        Genre genre,
        Long centreId
){ }
