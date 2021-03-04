import java.util.Scanner;
import java.util.ArrayList;
public class Wwm{
  //HAUPT METHODEN
  Scanner sc = new Scanner(System.in);
  
  FiftyFifty fiftyFifty = new FiftyFifty();
  PublikumsJoker publikumsJoker = new PublikumsJoker();
  TelefonJoker telefonJoker = new TelefonJoker();
  ZusatzJoker zusatzJoker = new ZusatzJoker(); 

  public void start(){
    
    System.out.println("Willkommen bei wer wird Millionär?");
    System.out.println("");
    System.out.println("Du hast folgende Joker zur Verfügung:");
    if(fiftyFifty.istVerfuegbar()){
      System.out.println("fiftyFifty");
    }
    if(publikumsJoker.istVerfuegbar()){
      System.out.println("PublikumsJoker");
    }  
    if(telefonJoker.istVerfuegbar()){
      System.out.println("TelefonJoker");
    }
    if(zusatzJoker.istVerfuegbar()){
      System.out.println("ZusatzJoker");
    }
		ArrayList<Frage> fragenliste = ReadFromFile.readFragen("fragen.txt");
	
			fragenliste.get(1).fragestellung();
			
	


  }

  public void exit(){ //Funktioniert: Getestet.
    System.out.println("Schade! Sie haben verloren!");
    System.out.println("Wollen Sie es erneut versuchen?");
    //Entscheidung Ja/Nein
    if(sc.nextInt()==1){
      start();
    }
    else{
      System.out.print("\033[H\033[2J");  
      System.out.flush();
			System.exit(0);  
    }
  }


  //EXTRA BEREICH
  //Zusatz Methoden
  public void art(){ //Eventuell ASCII Art (Zusatz) falls wer bock hat.

  }
  

  //CHEATS
}