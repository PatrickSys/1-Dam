package ClasseCotxe;


enum marxesManual{R, N, Primera, Segona, Tercera, Quarta, Quinta, Sisena}

enum marxesAutomatic{ F,N,R}


public class CotxeSegonaPart_Patrick extends Cotxe_Patrick implements InterfaceCotxe {


    protected marxesManual marxaManual = marxesManual.N; //Cream i inicialitzam la variable de la marxaManual
    protected marxesAutomatic marxaAutomatica = marxesAutomatic.N;
    protected int marxaManualActual = 1; //Amb aquesta variable podrem anar canviant de marxa i equiparar-la a l'enum
    protected int marxaAutomaticaActual = 1;

    public CotxeSegonaPart_Patrick(String marca, String model, TipusCanvi tipuscanvi, EstatMotorCotxe estatcotxe) {
        super(marca, model, tipuscanvi, estatcotxe);

    }

    //per pujar i baixar marxes als cotxes manuals
    public void CanviaMarxaManual(char a) throws Exception { //mètode per Canviar marxa manual

        if (this.tipuscanvi == TipusCanvi.CanviManual) {
            if (a == '+') {  //si inserim '+' per pujar una marxa
                if (this.marxaManual == marxesManual.Sisena) {
                    throw new Exception("Ja estàs a la marxa més alta"); //excepció si volem pujar quan ja esteim a sisena
                }
                marxesManual[] marxaManual = {marxesManual.R, marxesManual.N, marxesManual.Primera, marxesManual.Segona, marxesManual.Tercera, marxesManual.Quarta, marxesManual.Quinta, marxesManual.Sisena};
                marxaManualActual++;
                this.marxaManual = marxaManual[this.marxaManualActual];

            }
            if (a == '-') { //per a baixar marxa
                if (this.marxaManual == marxesManual.R) {
                    throw new Exception("Ja estàs a la marxa més baixa (R)"); //excepció si volem baixar quan ja esteim a R
                }
                marxesManual[] marxaManual = {marxesManual.R, marxesManual.N, marxesManual.Primera, marxesManual.Segona, marxesManual.Tercera, marxesManual.Quarta, marxesManual.Quinta, marxesManual.Sisena};
                marxaManualActual--;
                this.marxaManual = marxaManual[this.marxaManualActual];

            }

        } else {
            throw new Exception("No és un cotxe de Canvi Manual!!");
        } //excepció llançada si cridam al mètode de canvi manual a un cotxe automàtic
    }

    public void CanviarMarxaAutomatic(char b) throws Exception {

        if (this.tipuscanvi == TipusCanvi.CanviAutomatic) {
            if (b == '+') {  //si inserim '+' per pujar una marxa
                if (this.marxaAutomatica == marxesAutomatic.F) {
                    throw new Exception("Ja estàs a la marxa més alta (F)"); //excepció si volem pujar quan ja esteim a sisena
                }
                marxesAutomatic[] marxaAutomatica = {marxesAutomatic.R, marxesAutomatic.N, marxesAutomatic.F};
                marxaAutomaticaActual++;
                this.marxaAutomatica = marxaAutomatica[this.marxaAutomaticaActual];

            }

                if (b == '-') {  //si inserim '+' per pujar una marxa
                    if (this.marxaAutomatica == marxesAutomatic.R) {
                        throw new Exception("Ja estàs a la marxa més baixa (R)"); //excepció si volem pujar quan ja esteim a sisena
                    }
                    marxesAutomatic[] marxaAutomatica = {marxesAutomatic.R, marxesAutomatic.N, marxesAutomatic.F};
                    marxaAutomaticaActual--;
                    this.marxaAutomatica = marxaAutomatica[this.marxaAutomaticaActual];


            }
        }
    }
        //Getter de la marxa manual a la que estem
        public String getMarxaManual(){
            return "La marxa manual actual és " + this.marxaManual;
        }

        //Getter de la marrxa automatica a la que estem
        public String getMarxaAutomatic(){
            return "La marxa automàtica actual és " +this.marxaAutomatica;
        }

    }


