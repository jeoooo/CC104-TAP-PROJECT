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
        String[] questions = {"Why do you need _____ dollars?", "Please pursuade him _____ that", "Don't pretend _____ recognize me."};

        int score = 0;
        String PlayerAnswer;
        DNode<String> choice1 = new DNode<>(null, "0.) hundred", null);
        DNode<String> choice2 = new DNode<>(null, "1.) a hundred", null);
        DNode<String> choice3 = new DNode<>(null, "2.) don't do", null);
        DNode<String> choice4 = new DNode<>(null, "3.)not to do", null);
        DNode<String> choice5 = new DNode<>(null, "4.) to not", null);
        DNode<String> choice6 = new DNode<>(null, "5.) not to", null);

        MyArrayList<DNode> ListOfChoices = new MyArrayList<>();

        try {
            ListOfChoices.add(0, choice1);
            ListOfChoices.add(1, choice2);
            ListOfChoices.add(2, choice3);
            ListOfChoices.add(3, choice4);
            ListOfChoices.add(4, choice5);
            ListOfChoices.add(5, choice6);

            for (int i = 0; i < questions.length; i++) {
                int rand = new Random().nextInt(questions.length);

                System.out.println("Match the correct grammar \n" + questions[rand] + "\n");
                ListOfChoices.showList();
                System.out.println("\nYour answer: ");
                PlayerAnswer = answer.next();

                if (questions[rand].contentEquals(questions[0])) {
                    if (PlayerAnswer.equalsIgnoreCase("1")) {
                        score++;
                    }
                }
                if (questions[rand].contentEquals(questions[1])) {
                    if (PlayerAnswer.equalsIgnoreCase("3")) {
                        score++;
                    }
                }
                if (questions[rand].contentEquals(questions[2])) {
                    if (PlayerAnswer.equalsIgnoreCase("5")) {
                        score++;
                        ListOfChoices.showList();
                    }
                }

            }

            System.out.println("\n\n Quiz Finished\n");
            System.out.println("Score: " + score + "/" + questions.length);

        } catch (InvalidIndexException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
