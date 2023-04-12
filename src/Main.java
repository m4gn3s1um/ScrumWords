import javax.swing.*;
import java.util.ArrayList;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.lang.Math;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        ArrayList<String> scrumWords = new ArrayList<>();

        scrumWords.add("Backlog");
        scrumWords.add("Product owner");
        scrumWords.add("User story");
        scrumWords.add("Agile");
        scrumWords.add("Sprint review");
        scrumWords.add("Scrummaster");
        scrumWords.add("Sprint");
        scrumWords.add("Sprint retrospective");
        scrumWords.add("Daily scrum");
        scrumWords.add("Team");
        scrumWords.add("Sprint plan");
        scrumWords.add("Stakeholder");
        scrumWords.add("Task");
        scrumWords.add("Epic user story");
        scrumWords.add("Spike");
        scrumWords.add("Burndown chart");
        scrumWords.add("Estimering");
        scrumWords.add("Poker planning");


        JFrame jf = new JFrame();
        jf.setVisible(true);

       jf.addKeyListener(new KeyAdapter() {
           @Override
           public void keyPressed(KeyEvent e) {
               if(scrumWords.size() == 0){
                   System.out.println("No more words.");
               } else {
                   int rand = (int) (Math.random() * scrumWords.size());
                   System.out.println(scrumWords.get(rand));
                   scrumWords.remove(rand);
               }
           }
       });
    }
}