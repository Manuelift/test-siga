package cl.amsa.mantenedores.siga_mantenedores.services;

import cl.amsa.mantenedores.siga_mantenedores.domains.EmpresaMantenedor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmpresaMantenedorRepository extends JpaRepository<EmpresaMantenedor, UUID> {
}