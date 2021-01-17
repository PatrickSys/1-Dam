package DiesEntreDates;

public class TestDiesEntreDates {
    private static DiesEntreDates_Patrick_Rosselló exemple;
    private static DataXS inici, desti, test1,test2;

    public static void main(String[] args) {
        exemple=new DiesEntreDates_Patrick_Rosselló();




        try {

    inici=new DataXS("12/12/2018");
    desti= new DataXS("12/12/2021");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(exemple.nombreDiesTotals(inici, desti));
    }

}
