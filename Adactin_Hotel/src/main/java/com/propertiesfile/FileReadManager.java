package com.propertiesfile;

import java.io.IOException;

public class FileReadManager {
	
	//private
	
	private void FileReadManager() {
		
	}
	
	//static
	
	public static FileReadManager getInstancefr() {
		
		FileReadManager frm = new FileReadManager();
		
		return frm;
		// TODO Auto-generated method stub

	}
	
	public Configration_Reader getInstancecr() throws IOException {
		
		
		Configration_Reader reader = new Configration_Reader(); 
		// TODO Auto-generated method stub
		return reader;

	}

}
