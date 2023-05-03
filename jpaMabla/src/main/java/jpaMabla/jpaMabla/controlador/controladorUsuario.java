package jpaMabla.jpaMabla.controlador;

import jpaMabla.jpaMabla.entidad.usuario;
import jpaMabla.jpaMabla.servicio.metodosUsuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controladorUsuario {
    private metodosUsuario metodosUser;

    public controladorUsuario(metodosUsuario metodosUser) {
        this.metodosUser = metodosUser;
    }
    @GetMapping("/datosusuario")
    public List<usuario> datos(){
        return metodosUser.mostrar();
    }
    @PostMapping("/insertarusuario")
    public String insertar(@RequestBody usuario u){
        return metodosUser.insertar(u);}

    @PutMapping("/actualizarusuario")
    public String actualizar(@RequestBody usuario u){
        return metodosUser.actualizar(u);
    }
    @DeleteMapping("/eliminarusuario/{alias}")
    public String eliminar(@PathVariable("alias") String alias){
        return metodosUser.eliminar(alias);
    }
}
