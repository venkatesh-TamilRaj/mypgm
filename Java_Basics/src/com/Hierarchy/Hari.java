package com.Hierarchy;

public class Hari extends Super_Market                   {
	
	
	private void candy() {
		// TODO Auto-generated method stub
System.out.println("Milky Bar");
	}

	
	
	public static void main(String[] args) {
		
		Super_Market S =new Super_Market();
		Ram R =new Ram();
		Roja Roj= new Roja();
		Hari H= new Hari();
		
		S.milk();
        S.vegetables();
		R.milk();
        Roj.fruits();
        H.candy();
        R.rice();
        R.pastta();
        Roj.note_Book();
	}
}
