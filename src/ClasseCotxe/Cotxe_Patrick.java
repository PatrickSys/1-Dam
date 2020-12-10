package ClasseCotxe;

public class Cotxe_Patrick extends CotxeAbstracte implements InterfaceCotxe {

        protected EstatMotorCotxe estatcotxe;

        public Cotxe_Patrick(String marca, String model, TipusCanvi tipuscanvi, EstatMotorCotxe estatcotxe){
            super(marca, model, tipuscanvi);
            this.estatcotxe = estatcotxe;
        }

        //Getters
        public String getCoche(){
            return "La marca del cotxe és: " + this.marca + ", el model del coche: " + this.model + ", el tipo de canvi: " + this.tipuscanvi + " i el coche està: " + this.estatcotxe;
        }

        @Override
        public void arrancarMotor() throws Exception {
            if (this.comprovarmotor()==EstatMotorCotxe.Aturat){
                this.estatcotxe = EstatMotorCotxe.Arrancat;
            }else throw new Exception("El coche ya esta en marcha");
        }

        @Override
        public EstatMotorCotxe  comprovarmotor() {
            return estatcotxe;
        }

        @Override
        public int getRevolutions() {
            if (comprovarmotor()==EstatMotorCotxe.Arrancat) {
                return (int)(Math.random() * 6500)+1;
            }else return 0;
        }

        @Override
        public void aturarMotor() throws Exception {
            if (comprovarmotor()==EstatMotorCotxe.Arrancat){
                estatcotxe = EstatMotorCotxe.Aturat;
            }else throw new Exception("El coche ya esta parado");
        }
}
