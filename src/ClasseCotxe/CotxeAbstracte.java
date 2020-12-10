package ClasseCotxe;

public abstract class CotxeAbstracte {
        protected String marca;
        protected String model;
        protected TipusCanvi tipuscanvi;

        public CotxeAbstracte(String marca, String model, TipusCanvi tipuscanvi) {
            this.marca = marca;
            this.model = model;
            this.tipuscanvi = tipuscanvi;
        }

        public String getMarca(){
            return this.marca;
        }

        public String getModel(){
            return this.model;
        }

        public TipusCanvi getTipuscanvi(){
            return this.tipuscanvi;
        }
    }


