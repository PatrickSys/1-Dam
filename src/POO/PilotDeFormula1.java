package POO;


    //classe-plataforma i cream atributs
public class PilotDeFormula1 {
    String nombre;
    String habilidad;
    String vehiculo;
    int edad;


    //metode constructor(dóna estat inicial a l'objecte) per assignar valors als atributs de la classe-plataforma
    public PilotDeFormula1(String nombre, String habilidad, String vehiculo, int edad) { //assignam paràmetres a atributs
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.vehiculo = vehiculo;
        setEdad(edad);  //es lo mateix
    }


        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getHabilidad() {
            return habilidad;
        }

        public void setHabilidad(String habilidad) {
            this.habilidad = habilidad;
        }

        public String getVehiculo() {
            return vehiculo;
        }

        public void setVehiculo(String vehiculo) {
            this.vehiculo = vehiculo;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }
