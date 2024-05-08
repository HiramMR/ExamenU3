package usuario;
import java.time.LocalDate;

import usuario.utils.Curp;
import usuario.utils.Estado;
import usuario.utils.Genero;
import usuario.utils.Rfc;
import usuario.utils.Rol;

public class Persona {
    String nombre, primerApellido, segundoApellido, ciudad, rfc, curp, direccion;
    Genero genero;
    LocalDate fechaNacimiento;
    Estado estado;
    Rol rol;

    public Persona(String nombre, String primerApellido, String segundoApellido, String fecha, String genero, String estado){
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = LocalDate.of(Integer.parseInt(fecha.substring(7)), Integer.parseInt(fecha.substring(0,3)), Integer.parseInt(fecha.substring(4,6)));
        this.genero = obtenerGenero(genero);
        this.estado = obtenerEstado(Integer.parseInt(estado));
        curp = Curp.crearCurp(nombre, primerApellido, segundoApellido, genero, fechaNacimiento, estado);
        rfc = Rfc.crearRfc(curp);
        System.out.println(curp);
        System.out.println(rfc);
    }

    public Persona(String nombre, String primerApellido, String segundoApellido, String fecha, Genero genero, String ciudad, Estado estado, String direccion, Rol rol){
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = LocalDate.of(Integer.parseInt(fecha.substring(7)), Integer.parseInt(fecha.substring(0,3)), Integer.parseInt(fecha.substring(4,6)));
        this.genero = genero;
        this.ciudad = ciudad;
        this.estado = estado;
        this.direccion = direccion;
        this.rol = rol;
        curp = Curp.crearCurp(nombre, primerApellido, segundoApellido, genero, fechaNacimiento, estado);
        System.out.println(curp);
    }

    private Estado obtenerEstado(int option){
        Estado estado = null;

        switch(option){
            case 1 -> estado = Estado.Aguascalientes;
            case 2 -> estado = Estado.BCN;
            case 3 -> estado = Estado.BCS;
            case 4 -> estado = Estado.Campeche;
            case 5 -> estado = Estado.Coahuila;
            case 6 -> estado = Estado.Colima;
            case 7 -> estado = Estado.Chiapas;
            case 8 -> estado = Estado.Chihuahua;
            case 9 -> estado = Estado.CDMX;
            case 10 -> estado = Estado.Durango;
            case 11 -> estado = Estado.Guanajuato;
            case 12 -> estado = Estado.Guerrero;
            case 13 -> estado = Estado.Hidalgo;
            case 14 -> estado = Estado.Jalisco;
            case 15 -> estado = Estado.EdoMex;
            case 16 -> estado = Estado.Michoacan;
            case 17 -> estado = Estado.Morelos;
            case 18 -> estado = Estado.Nayarit;
            case 19 -> estado = Estado.NuevoLeon;
            case 20 -> estado = Estado.Oaxaca;
            case 21 -> estado = Estado.Puebla;
            case 22 -> estado = Estado.Queretaro;
            case 23 -> estado = Estado.QuintanaRoo;
            case 24 -> estado = Estado.SLP;
            case 25 -> estado = Estado.Sinaloa;
            case 26 -> estado = Estado.Sonora;
            case 27 -> estado = Estado.Tabasco;
            case 28 -> estado = Estado.Tamaulipas;
            case 29 -> estado = Estado.Tlaxcala;
            case 30 -> estado = Estado.Veracruz;
            case 31 -> estado = Estado.Yucatan;
            case 32 -> estado = Estado.Zacatecas;
            case 33 -> estado = Estado.NacidoExtranjero;
        }

        return estado;
    }

    private Genero obtenerGenero(String respuestaGenero){
        Genero genero = null;

        if(respuestaGenero.equals("H")){
            genero = Genero.Hombre;
        } else if(respuestaGenero.equals("M")){
            genero = Genero.Mujer;
        }

        return genero;
    }


}
