package cl.amsa.mantenedores.siga_mantenedores.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TrabajadorMantenedor {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    private String Nombres;
    private String RUT;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String Genero;
    private String EstadoCivil;
    private String NivelEducacional;
    private String FechadeNacimiento;
    private String PaisOrigen;
    private String Correo;
    private LocalDate PrimerDiaTurno;

    @OneToMany(targetEntity = Direccion.class, cascade = CascadeType.ALL)
    @JoinColumn (name = "TrabajadorId", referencedColumnName = "id")
    private List<Direccion> direcciones;
}
