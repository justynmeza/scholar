/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scholar;


/**
 *
 * @author estudiante
 */
public class persona {
    

    public String nombre;
    public String apellido;
    public String fecha_nacimiento ;
    public String sangre;
    public String nacionalidad;
    public String identificacion;
    public String telefono;
    public String direccion;
    public String correo_electronico;
    public String genero;
    public int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void printname(){
        System.out.println(this.nombre+" "+this.apellido);
    } 
    public int caledad(){
        
        int DIA = 20;
        int MES = 9;
        int AÑO = 2001;
        if (2019 > AÑO){
            int edadA = 2019-AÑO; //edadA: edad anual o adad a cumplir en el año
            
            if ( MES >= 9 ){
                if (DIA >= 20){
                    edad = edadA;
                }
                else{
                    edad = edadA - 1;
                }    
            }
            else {
                edad = edadA - 1;
            }
        }
        else{
            System.out.println("año erroneo");
        }
         return edad;
    }
}

