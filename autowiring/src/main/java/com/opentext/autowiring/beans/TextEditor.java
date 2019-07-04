package com.opentext.autowiring.beans;

public class TextEditor {
	
	private String name;
	private SpellChecker spellchecker;
	
	public TextEditor(String name,SpellChecker spellChecker) {
		this.name=name;
		this.spellchecker=spellChecker;
	}
	
	//getter n setter methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SpellChecker getSpellchecker() {
		return spellchecker;
	}
	public void setSpellchecker(SpellChecker spellchecker) {
		this.spellchecker = spellchecker;
	}
		
	

}
