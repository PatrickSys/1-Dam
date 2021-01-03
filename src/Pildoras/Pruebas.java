package Pildoras;

public class Pruebas {
    public static void main(String[] args) {
        /*Empleado carlos=new Empleado("Carlos", 17000, 2020, 10, 25);

        Empleado Ana=new Empleado("Ana", 30000, 1994, 11, 20);

        Empleado Maria=new Empleado("María", 10000, 2020, 10, 5);
        */




        Empleado[] misEmpleados = new Empleado[3];

        misEmpleados[0]= new Empleado("Carlos", 17000, 2020, 10, 25);
        misEmpleados[1]= new Empleado("Ana", 30000, 1994, 11, 20);
        misEmpleados[2]= new Empleado("Maria", 10000, 2020, 10, 5);

        /*for(int i=0; i<misEmpleados.length; i++){
            misEmpleados[i].subeSueldo(10);
            System.out.println(misEmpleados[i].getSueldo());
        }*/

        for(Empleado e:misEmpleados){    //enhanced for
            e.subeSueldo(10);
        }

        for (Empleado d:misEmpleados){
            System.out.println(d.getNombreId());

        }

    }
}
