package jpaMabla.jpaMabla.servicio;

import jpaMabla.jpaMabla.entidad.usuario;
import jpaMabla.jpaMabla.repositorio.repositorioUsuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class metodosUsuario {
    private repositorioUsuario repositorio;

    public metodosUsuario(repositorioUsuario repositorio) {
        this.repositorio = repositorio;
    }
    public List<usuario> mostrar(){
        return repositorio.findAll();
    }
    public String insertar(usuario u){
        if(repositorio.findById(u.getAlias()).isPresent())
            return "El nombre de usuario ya existe";
        else{
            repositorio.save(u);
            return "Usuario creado";
        }
    }
    public String actualizar(usuario u){
        if(repositorio.findById(u.getAlias()).isPresent()) {
            repositorio.save(u);
            return "Sus datos han sido actualizados";
        }else return null;
    }
    public String eliminar(String alias){
        if(repositorio.findById(alias).isPresent()){
            repositorio.deleteById(alias);
            return "Usuario eliminado";
        }
        else return null;
    }
}
