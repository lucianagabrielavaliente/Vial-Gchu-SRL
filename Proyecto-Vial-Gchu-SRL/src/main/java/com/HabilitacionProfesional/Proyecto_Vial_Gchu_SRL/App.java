package com.HabilitacionProfesional.Proyecto_Vial_Gchu_SRL;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;

import Controladoras.ControladorEmpleado;
import Controladoras.ControladorMaquinaria;
import Controladoras.ControladorProyecto;
import Domain.Empleado;
import Domain.Maquinaria;
import Domain.Proyecto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Long id = (long) 1;
    	LocalDate date1 = LocalDate.of(2021, Month.JANUARY, 1);
    	LocalDate date2 = LocalDate.of(2022, Month.DECEMBER, 31);

    	ControladorProyecto controlador = new ControladorProyecto();
    	

    	LinkedList<Proyecto> listado = controlador.buscarEntreFechas(date1, date2);
    	
        for (Proyecto item : listado) {
            System.out.println(item.getNombre());
            System.out.println(item.getFechaInicio());
          }

        

    	


    }
}
