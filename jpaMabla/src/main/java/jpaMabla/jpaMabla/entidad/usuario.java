package jpaMabla.jpaMabla.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.awt.*;

@Entity
@Table(name="Usuario")
public class usuario {
    @Id
    @Column(unique= true, length = 50)
    private String Alias;
    @Column(nullable = false, length = 30)
    private String Nombre;
    @Column(nullable = false, length = 30)
    private String Apellido;
    @Column(nullable = false, length = 30)
    private int Teléfono;
    @Column(nullable = false, length = 30)
    private String Correo;
    @Column(nullable = false, length = 30)
    private String Contraseña;
    private Image img_Perfil;
    public usuario() {
    }
    public usuario(String alias, String nombre, String apellido, int teléfono, String correo, String contraseña, Image img_Perfil) {
        Alias = alias;
        Nombre = nombre;
        Apellido = apellido;
        Teléfono = teléfono;
        Correo = correo;
        Contraseña = contraseña;
        this.img_Perfil = img_Perfil;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String alias) {
        Alias = alias;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(int teléfono) {
        Teléfono = teléfono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public Image getImg_Perfil() {
        return img_Perfil;
    }

    public void setImg_Perfil(Image img_Perfil) {
        this.img_Perfil = img_Perfil;
    }
}
