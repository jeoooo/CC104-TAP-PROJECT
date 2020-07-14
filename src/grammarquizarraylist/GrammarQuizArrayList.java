/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grammarquizarraylist;

import doublylinkedlist.DNode;
import static grammarquizarraylist.Sentence.ShuffleSentence;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jeo
 */
public class GrammarQuizArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner answer = new Scanner(System.in);
        String sentence1 = "this is a new sentence";

        ShuffleSentence(sentence1);
        System.out.println("\nYour Answer: ");
        String ans = answer.next();
        
        
        //dili ko ka insert ug shufflesentence(sentence1) method sulod sa node tungod sa void data type
        //basin i consider nlng nto by pre shuffled ang sentences by default 
        // like i declare nato sya daan as 
        // String sentence1 = "this sentence new a is";
        //mag formulate nlng tag algorithm para icheck ang answer
        
        
//        DNode<String> answer1 = new DNode<>(null,sentence1,null);
//        
//        MyArrayList<DNode> list = new MyArrayList<>();
//        try {
//            list.add(0, answer1);
//            if(ans.equals(list.get(0).toString())){
//                System.out.println("Wrong! The correct answer is " + sentence1);
//            }
//            else{
//                System.out.println("Correct!");
//            }
//        } catch (InvalidIndexException e) {
//            System.out.println(e.getMessage());
//        }
        
        

    }

//    public static String[] shuffleSentences(String sentence){
//        Random rand = new Random();
//        String[] shufflesentence = sentence.split(" ");
//        for (int i = 0; i < shufflesentence.length; i++) {
//            int randomPosition = rand.nextInt(shufflesentence.length);
//            String temp = shufflesentence[i];
//            shufflesentence[i] = shufflesentence[randomPosition];
//            shufflesentence[randomPosition] = temp;
//        }
//        
//        return shufflesentence;
//           
//        for (int i = 0; i < wordArray.length; i++) {
//            System.out.print(wordArray[i] + " ");
//        }
//        
//    }
}
