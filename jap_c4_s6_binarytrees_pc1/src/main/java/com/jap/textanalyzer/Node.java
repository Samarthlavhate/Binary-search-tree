package com.jap.textanalyzer;

public class Node {
//Declare word and node objects for left and right - recursive data types
public Word word;
public Node left,right;

// Declare a parameterized constructor that take only word object as the parameter
public Node(Word word) {
    this.word=word;

}
// Declare a no-arg constructor
public Node() {
left=null;
right=null;
}

}
