package com.proyecto.programacion.proyectoprogramacion.ModeloPersonas;

import com.proyecto.programacion.proyectoprogramacion.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marthahaydebenitezgomez on 04/03/16.
 */
public class Personas {

    //DECLARACION DE VARIABLES
    private int Nombre_Persona;
    private int Descripcion_Persona;
    private int Edad_Persona;
    private int carrera_Persona;
    private int Img_persona;
    private int EstadoCivil_persona;
    private int Numero_Persona;
    private int Email_Persona;
    private int Facebook_Link;
    private int Twitter_Link;
    private int Web_Link;

    //CONSTRUCTOR
    public Personas(
            int nombre_Persona,
            int descripcion_Persona,
            int edad_Personaint,
            int carrera_Persona,
            int img_persona,
            int estadoCivil_persona,
            int numero_Persona,
            int email_Persona,
            int facebook_Link,
            int twitter_Link){

        this.Nombre_Persona = nombre_Persona;
        this.Descripcion_Persona = descripcion_Persona;
        this.Edad_Persona = edad_Personaint;
        this.carrera_Persona = carrera_Persona;
        this.Img_persona = img_persona;
        this.EstadoCivil_persona = estadoCivil_persona;
        this.Numero_Persona = numero_Persona;
        this.Email_Persona = email_Persona;
        this.Facebook_Link = facebook_Link;
        this.Twitter_Link = twitter_Link;

    }

    //Agregarse con su numero de persona que definieron en  string
    public static final List<Personas> PERSONAS_LIST = new ArrayList<Personas>();

    static {
        PERSONAS_LIST.add(new Personas(R.string.nombreP1,
                        R.string.descripcionP1,
                        R.string.edadP1,
                        R.string.carreraP1,
                        R.drawable.allan,
                        R.string.estadocivilP1,
                        R.string.telefonoP1,
                        R.string.emailP1,
                        R.string.facebookP1,
                        R.string.twitterP1)
                        
        PERSONAS_LIST.add(new Personas(R.string.nombreP3,
                        R.string.descripcionP3,
                        R.string.edadP3,
                        R.string.carreraP3,
                        R.drawable.edy,
                        R.string.estadocivilP3,
                        R.string.telefonoP3,
                        R.string.emailP3,
                        R.string.facebookP3,
                        R.string.twitterP3)

                
        );
        PERSONAS_LIST.add(new Personas(R.string.nombreP8,
                        R.string.descripcionP8,
                        R.string.edadP8,
                        R.string.carreraP8,
                        R.drawable.marthabenitez,
                        R.string.estadocivilP8,
                        R.string.telefonoP8,
                        R.string.emailP8,
                        R.string.facebookP8,
                        R.string.twitterP8)

                
        );
        PERSONAS_LIST.add(new Personas(R.string.nombreP9,
                        R.string.descripcionP9,
                        R.string.edadP9,
                        R.string.carreraP9,
                        R.drawable.paolabetancourt,
                        R.string.estadocivilP9,
                        R.string.telefonoP9,
                        R.string.emailP9,
                        R.string.facebookP9,
                        R.string.twitterP9)

                
        );

    }

    public int getNombre_Persona() {
        return Nombre_Persona;
    }

    public int getDescripcion_Persona() {
        return Descripcion_Persona;
    }

    public int getEdad_Persona() {
        return Edad_Persona;
    }

    public int getCarrera_Persona() {
        return carrera_Persona;
    }

    public int getImg_persona() {
        return Img_persona;
    }

    public int getEstadoCivil_persona() {
        return EstadoCivil_persona;
    }

    public int getNumero_Persona() {
        return Numero_Persona;
    }

    public int getEmail_Persona() {
        return Email_Persona;
    }

    public int getFacebook_Link() {
        return Facebook_Link;
    }

    public int getTwitter_Link() {
        return Twitter_Link;
    }

    public int getWeb_Link() {
        return Web_Link;
    }
}
