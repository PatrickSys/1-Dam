package DiesEntreDates;


public class DiesEntreDates_Patrick_Rosselló extends CalcularDiesEntreDates {


    @Override
protected int diesMes(int mes) { //Array per a obtenir posteriorment el nombre de dies que te un mes concret
    int[] mesos = new int[]{
            31, 28, 31,
            30, 31, 30,
            31, 31, 30,
            31, 30, 31
    };

    return mesos[mes-1];
}

    @Override
    protected int diesMesInicial(DataXS dataXS) { //Mètode per a obtenir els dies que obtenim al primer mes des de la data destí
        return this.diesMes(dataXS.mes) - dataXS.dia;
    }

    @Override
    protected int diesMesDesti(DataXS dataXS) {  //Mètode "invers" a l'anterior, obtenim els dies del mes destí

        return dataXS.dia;
    }

    @Override
    protected int diesResteAnyInicial(DataXS datainicial) { //Mètode per a obtenir els dies que falten per a acabar l'any, sumant els dies dels mesos sencers
        int diesAny=0;
        for(int i=datainicial.mes+1; i<=12; i++){
            diesAny+=this.diesMes(i);

        }
        return diesAny;
    }

    @Override
    protected int diesResteAnyDesti(DataXS datadesti) { //Mètode invers a l'anterior, obtenim els dies des del principi de l'any de destí, comptant els mesos sencers

        int diesAnyDesti=0;
                for(int i=1; i<datadesti.mes; i++){
                    diesAnyDesti+=diesMes(i);
                }
        return  diesAnyDesti;
    }

    @Override
    protected int diesNumAnysComplets(DataXS datainicial, DataXS datadesti) { //Mètode per a obtenir els dies a partir dels anys sencers des de la data inici a la destí


        return  ((datadesti.any-datainicial.any)-1)*365;
    }

    @Override

    protected int numDiesPerAnysdeTraspas(DataXS datainicial, DataXS datadesti) {       //Mètode per a sumar un dia si hem passat per 29 de febrer, és a dir si l'any es de traspas i a l'inici no hem passat de febrer, i al desti ja hi hem passat
        int anysDeTraspas=0;
        for (int i = datainicial.any+1; i < datadesti.any; i++) {
            if (anyDeTraspas(i)){
                anysDeTraspas++;
            }
        }
        if ((datainicial.anyDeTraspas)&&(datainicial.mes<=2)){
            anysDeTraspas++;

        }
        if ((datadesti.anyDeTraspas)&&((datadesti.mes>2)||((datadesti.mes==2)&&(datainicial.dia==29)))){
            anysDeTraspas++;
        }
        if ((datadesti.anyDeTraspas)&&(datadesti.any==datainicial.any)&&(anysDeTraspas>0)){
            anysDeTraspas--;
        }

        return anysDeTraspas;
    }

    @Override
    protected boolean anyDeTraspas(int any) {   //per a obtenir si un any es de traspas

        return(any % 400 == 0) || ((any % 4 == 0) && !(any % 100 == 0));
    }
}
