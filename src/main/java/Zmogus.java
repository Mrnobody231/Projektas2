import org.openqa.selenium.WebDriver;

public class Zmogus {

    String vardas;
    int amzius;



    public Zmogus(String vardas, int amzius){
        this.vardas = vardas;
        this.amzius = amzius;
    }
    public String getVardas(){
        return vardas;
    }

    public int getAmzius(){
        return amzius;
    }
}
