package com.jap.textanalyzer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextAnalyzer {
	// This method takes the file name as a parameter and returns the binary search tree
	// Read the file and populate the binary search tree
	public BinarySearchTree readWordFile(String fileName)
	{
		BinarySearchTree bst = new BinarySearchTree();

		try{
			BufferedReader bf=new BufferedReader(new FileReader(fileName));
			String line;
			int i=0;
			while((line= bf.readLine())!=null){
				String [] array=line.split("[,.;://s]");
                 for(i=0;i< array.length;i++) {
					 Word wr = new Word(array[i], 1);
					 bst.root=bst.insert(bst.root/*node*/,wr);
				 }

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bst;
	}

}
