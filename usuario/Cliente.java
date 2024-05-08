package usuario;

import java.time.LocalDate;
import java.util.ArrayList;

import banco.utils.Sucursal;
import usuario.utils.Estado;
import usuario.utils.Genero;

public class Cliente extends Persona{
    public Cliente(String nombre, String primerApellido, String segundoApellido, String fecha, Genero genero, Estado estado, LocalDate fechaRegistro, Sucursal sucursalRegistro){
        super(nombre, primerApellido, segundoApellido, fecha, genero, estado);
    }
}
