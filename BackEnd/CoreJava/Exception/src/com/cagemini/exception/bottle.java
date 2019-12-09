package com.cagemini.exception;

import java.io.File;
import java.io.IOException;

public class bottle {
	void open() throws IOException 
	{
		File f=new File("abcd.txt");
		f.createNewFile();
	}
}