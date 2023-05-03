package jpaMabla.jpaMabla.repositorio;

import jpaMabla.jpaMabla.entidad.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioUsuario extends JpaRepository<usuario, String> {

}
