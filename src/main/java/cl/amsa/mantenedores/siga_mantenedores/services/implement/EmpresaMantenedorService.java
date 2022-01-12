package cl.amsa.mantenedores.siga_mantenedores.services.implement;

import cl.amsa.mantenedores.siga_mantenedores.domains.EmpresaMantenedor;
import cl.amsa.mantenedores.siga_mantenedores.services.EmpresaMantenedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class EmpresaMantenedorService {
    @Autowired
    EmpresaMantenedorRepository empresaMantenedorRepository;

    public List<EmpresaMantenedor> getEmpresaMantenedor(){
        return (empresaMantenedorRepository.findAll());
    }

    public EmpresaMantenedor createEmpresaMantenedor (EmpresaMantenedor empresaMantenedor){
        return empresaMantenedorRepository.save(empresaMantenedor);
    }

    public boolean deleteEmpresaMantenedor (UUID id){
        try {
            empresaMantenedorRepository.deleteById(id);
            return true;
        } catch (Exception err){
            return false;
        }
    }
    public EmpresaMantenedor updateEmpresaMantenedor (EmpresaMantenedor empresaMantenedor){
        return empresaMantenedorRepository.save(empresaMantenedor);
    }
}
