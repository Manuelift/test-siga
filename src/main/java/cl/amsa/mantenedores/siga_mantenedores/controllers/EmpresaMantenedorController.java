package cl.amsa.mantenedores.siga_mantenedores.controllers;

import cl.amsa.mantenedores.siga_mantenedores.domains.EmpresaMantenedor;
import cl.amsa.mantenedores.siga_mantenedores.services.implement.EmpresaMantenedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "empresaMantenedor")
public class EmpresaMantenedorController {

    @Autowired
    EmpresaMantenedorService empresaMantenedorService;

    @PostMapping("/")
    public EmpresaMantenedor createEmpresaMantenedor(@RequestBody EmpresaMantenedor newEmpresaMantenedor){
        return empresaMantenedorService.createEmpresaMantenedor(newEmpresaMantenedor);
    }

    @GetMapping("/")
    public List<EmpresaMantenedor> getEmpresaMantenedor(){
        return empresaMantenedorService.getEmpresaMantenedor();
    }

    @PutMapping(path = "/")
    public EmpresaMantenedor updateEmpresaMantenedor(@RequestBody EmpresaMantenedor updatedEpresaMantenedor){
        return empresaMantenedorService.updateEmpresaMantenedor(updatedEpresaMantenedor);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteEmpresaMantenedor(@PathVariable(value = "id") UUID id) {
        boolean ok = empresaMantenedorService.deleteEmpresaMantenedor(id);
        if (ok) return "Usuario " + id + " eliminado";
        else {
            return "No se pudo eliminar el usuario " + id;
        }
    }

}
