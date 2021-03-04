public abstract class Joker{
  // Telefon Joker
  // 50-50 Joker
  // Publikumsjoker
  // Zusatzjoker
  
	boolean jokerbenutzt;

	public boolean istVerfuegbar(){
		if (jokerbenutzt==true){
			return false;
  }else{
		return true;
	  }
  }

/*	public abstract void use();     */

}