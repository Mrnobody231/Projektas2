public class Masina extends Transportas  {

    int dureliuSkaicius;


    public Masina(String marke, String modelis, int metai, int dureliuSkaicius){
        super(marke, modelis, metai);
        this.dureliuSkaicius = dureliuSkaicius;

    }
    public int getDureliuSkaicius(){
        return dureliuSkaicius;
    }


    }



}
