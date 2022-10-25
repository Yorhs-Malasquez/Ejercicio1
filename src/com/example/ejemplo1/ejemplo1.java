package com.example.ejemplo1;

import java.util.Arrays;
import java.util.List;

public class ejemplo1 {
    public static void main(String[] args) {
        Mensaje msg=new Mensaje();
        String nombre = msg.solicitaDatos("Escribe tu nombre: ");
        String apellidos= msg.solicitaDatos("Escribe tu apellido: ");
        Persona p1=new Persona(nombre,apellidos);

        msg.saludar(p1);

        List<String> companyList= Arrays.asList("Google","Yahoo","Facebook","","Twitter","LinkedIn");
        System.out.println("Company List: "+companyList);

        //find only empty list count
        long emptyCount=companyList.stream().filter(cList->cList.isEmpty()).count();
        System.out.println("Test1: # of Empty Strings: "+emptyCount);

        //find company with character length more than 6
        long lengthCount=companyList.stream().filter(x->x.length()>6).count();
        System.out.println("Test2: of companies with char length>6: "+lengthCount);

        //match the pattern wich starts with letter T
        Long startCount=companyList.stream().filter(x->x.startsWith("T")).count();
        System.out.println("Test 3: # of companies which name starts with letter T: "+startCount);
    }
}
