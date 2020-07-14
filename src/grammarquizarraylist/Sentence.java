/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grammarquizarraylist;

import java.util.Random;

/**
 *
 * @author Jeo
 */
public class Sentence {
    private String sentence; 
    
    public Sentence(String sentence){
        this.sentence = sentence;
    }

    /**
     * @return the sentence
     */
    public String getSentence() {
        return sentence;
    }

    /**
     * @param sentence the sentence to set
     */
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
    
    public static void ShuffleSentence(String sentence){
        String[] wordArray = sentence.split(" ");

        Random rand = new Random();

        for (int i = 0; i < wordArray.length; i++) {
            int randomIndextoSwap = rand.nextInt(wordArray.length);
            String temp = wordArray[randomIndextoSwap];
            wordArray[randomIndextoSwap] = wordArray[i];
            wordArray[i] = temp;
        }

        for (int i = 0; i < wordArray.length; i++) {
            System.out.print(wordArray[i] + " ");
        }

        
    }
}
