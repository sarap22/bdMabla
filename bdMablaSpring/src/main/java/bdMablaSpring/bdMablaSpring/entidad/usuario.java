package bdMablaSpring.bdMablaSpring.entidad;
@Entity
@Table(name="Usuario")
public class usuario {
    Nombre varchar(30) not null,
    Apellido varchar(30),
    Teléfono int not null,
    Correo varchar(50),
    Alias varchar(50) not null,
    Contraseña varchar(100) not null,
    img_Perfil blob,
    primary key(Alias)
}
