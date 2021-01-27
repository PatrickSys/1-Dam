package Pildoras;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {
}

    class Empleado2 {
        public Empleado2(String nom, double sue, int agno, int mes, int dia) {

            sueldo = sue;

            GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);

            altaContrato = calendario.getTime();

            Id = IdSiguiente;
            IdSiguiente++;


        }

        public static String getNextId() {

            return "El ID siguiente es: " + IdSiguiente;
        }



        public double getSueldo() {
            return sueldo;
        }

        public Date getAltaContrato() {
            return altaContrato;
        }

        public void subeSueldo(double porcentaje) {
            double aumento = sueldo * porcentaje / 100;
            sueldo += aumento;

        }
        private double sueldo;
        private Date altaContrato;
        private int Id;
        private static int IdSiguiente=1;

    }



