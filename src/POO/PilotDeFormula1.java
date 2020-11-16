package POO;


    //classe i cream atributs
public class PilotDeFormula1 {
    private String nombre;
    private String habilidad;
    private String vehiculo;
    private int edad;


    //metode constructor per assignar valors als atributs de l'objecte
    public PilotDeFormula1(String nombre, String habilidad, String vehiculo, int edad) {
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.vehiculo = vehiculo;
        this.edad = edad;
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
