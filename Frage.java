import java.util.ArrayList;
import java.util.Random;
public class Frage{
	Random wuerfel = new Random();
  String quiz;
	String falsch1;
	String falsch2;
  String falsch3;
  String richtigeAntwort;
	ArrayList<String> randomanswer = new ArrayList<String>();

	public Frage(String pFrage, String pRichtig, String pFalsch1, String pFalsch2, String pFalsch3){
    quiz = pFrage;
    falsch1 = pFalsch1;
    falsch2 = pFalsch2;
    falsch3 = pFalsch3;
    richtigeAntwort = pRichtig;
  }
	public void fragestellung(){
		System.out.println("Frage: "+quiz);
		System.out.print("");
		System.out.println("Antwortmöglichkeiten:");
		randomanswer.add(0,falsch1);
		randomanswer.add(1,falsch2);
	  randomanswer.add(wuerfel.nextInt(2),falsch3);
		randomanswer.add(wuerfel.nextInt(3),richtigeAntwort);
		System.out.println(randomanswer);
	}

	public boolean answer(String pAntwort){
		if(pAntwort.equals(richtigeAntwort)){
			return true;
		}else{
			return false;
		}
	}
	public String toString(){
    String ret = "";
    ret = "Frage: " + quiz + "\nRichtige Antwort: " + richtigeAntwort + "\nFalsche Antworten: \n"+falsch1+"\n"+falsch2+"\n"+falsch3;
    
    return ret;
	}
}