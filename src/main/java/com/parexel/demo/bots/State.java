package com.parexel.demo.bots;

import java.util.ArrayList;
import java.util.Random;

/**
 * MajBot 1.0
 *
 * @author Seyed Majid Khosravi
 */
public class State {

    private String id = "";
    private ArrayList<String> messages;
    private ArrayList<Keyword> keywords;
    public String argument = "";

    // default constructor, constructs State object
    public State(String id, ArrayList<String> messages, ArrayList<Keyword> keywords) {
        this.id = id;
        this.messages = messages;
        this.keywords = keywords;
    }

    // get state id
    public String getId() {
        return id;
    }

    // get random state messages
    public String getMessage() {
        Random generator = new Random();
        return messages.get(generator.nextInt(messages.size()));
    }

    // set the argument from regex matcher
    public void setRegex(String argument){
        this.argument = argument;
    }

    // get state keywords
    public ArrayList<Keyword> getKeywords() {
        return keywords;
    }

	@Override
	public String toString() {
		return "State [id=" + id + ", messages=" + messages + ", keywords=" + keywords + ", argument=" + argument + "]";
	}
}
