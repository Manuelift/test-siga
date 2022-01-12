package cl.amsa.mantenedores.siga_mantenedores.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Direccion {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    private String Nombre;
    private String TelefonoMovil;
    private String TelefonoFijo;
    private String Pais;
    private String Region;
    private String Provincia;
    private String Comuna;
    private String Localidad;
    private String Correo;
    private String TipoDireccion;
    private String ZIP;
}
