package org.studySpring;

import java.io.File;
import java.io.IOException;

public class Alone {

	public static void main(String[] args) throws IOException {
//		File file = new File("StusySpring.txt"); // to store the things in specific path we can use 
//		// specific location with (//) in between the path
//		file.createNewFile();
		
		//creating a directory
		File directory = new File("damini\\loves\\ram");
		directory.mkdirs();
		System.out.println("directories created");
		File file = new File("damini\\loves\\ram\\I love you.txt");
		file.createNewFile();
		

	}

}
