public class Studentas extends Zmogus{
    String universitetas;

    public Studentas( String vardas, int amzius, String universitetas){
        super(vardas, amzius);
        this.universitetas = universitetas;
    }

    public String getUniversitetas(){
        return universitetas;
    }

    public static void main(String[]args){
        Studentas studentas1 = new Studentas("Arnas", 20, "Vilniaus universitetas");
        System.out.println("Vardas:" + studentas1.getVardas() + "," + "Amzius:" + studentas1.getAmzius() + ","
                + "universitetas:" + studentas1.getUniversitetas());
    }
}
