/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grammarquizarraylist;

import doublylinkedlist.DNode;
import java.util.Scanner;
import singlylinkedlist.SNode;

/**
 *
 * @author Jeo
 */
public class GrammmarQuizArrayList {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * @param args the command line arguments
         */
        Scanner answer = new Scanner(System.in);
//        String[] questions = {"Why do you need _____ dollars?", "Please pursuade him _____ that", "Don't pretend _____ recognize me."};

        int score = 0;
        String PlayerAnswer;

        SNode<String> question1 = new SNode<>("Why do you need _____ dollars?", null);
        SNode<String> question2 = new SNode<>("Please pursuade him _____ that", null);
        SNode<String> question3 = new SNode<>("Don't pretend _____ recognize me.", null);

        DNode<String> choice1 = new DNode<>(null, "0.) hundred", null);
        DNode<String> choice2 = new DNode<>(null, "1.) a hundred", null);
        DNode<String> choice3 = new DNode<>(null, "2.) don't do", null);
        DNode<String> choice4 = new DNode<>(null, "3.)not to do", null);
        DNode<String> choice5 = new DNode<>(null, "4.) to not", null);
        DNode<String> choice6 = new DNode<>(null, "5.) not to", null);

        MyArrayList<DNode> ListOfChoices = new MyArrayList<>();
        QuestionLinkedStack<SNode> StackOfQuestions = new QuestionLinkedStack<>();

        try {
            // ang stack is FIFO (first-in, first out)
            // so kung mag push mo ug questions unahi sa jud ang last item which is si question10
            //para ang last na ma push si question1 sya pud una ma pop
            //pki insert lng diri ang questions :D

            StackOfQuestions.push(question3);
            StackOfQuestions.push(question2);
            StackOfQuestions.push(question1);

            ListOfChoices.add(0, choice1);
            ListOfChoices.add(1, choice2);
            ListOfChoices.add(2, choice3);
            ListOfChoices.add(3, choice4);
            ListOfChoices.add(4, choice5);
            ListOfChoices.add(5, choice6);

            System.out.println("Match the correct grammar \n");
            System.out.println(StackOfQuestions.pop().getElement().toString());
            ListOfChoices.showList();
            System.out.println("\nYour answer: ");
            PlayerAnswer = answer.next();
            if (PlayerAnswer.equalsIgnoreCase("1")) { //scoring algorithm
                score++; //correct answer: 1.) a hundred --------> SEE ARRAYLIST OF QUESTIONS FOR THE CHOICES :D
            }

            System.out.println(StackOfQuestions.pop().getElement().toString());
            ListOfChoices.showList();
            System.out.println("\nYour answer: ");
            PlayerAnswer = answer.next();
            if (PlayerAnswer.equalsIgnoreCase("3")) {
                score++;
            }

            System.out.println(StackOfQuestions.pop().getElement().toString());
            ListOfChoices.showList();
            System.out.println("\nYour answer: ");
            PlayerAnswer = answer.next();
            if (PlayerAnswer.equalsIgnoreCase("5")) {
                score++;
            }

            System.out.println("\n\n Quiz Finished\n");
            System.out.println("Score: " + score + "/" + "10");

        } catch (InvalidIndexException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
