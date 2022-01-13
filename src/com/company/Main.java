package com.company;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String state[] = {"Introductory Exercises", "Projects", "Benchmark"};
        Integer i = 0;
        Integer Benchmark = 0;

        while (i < 4){
            System.out.println(state[i]);
            System.out.println(Benchmark);
            Scanner Pass = new Scanner(System.in);
            String pof = Pass.nextLine();
            if(pof.equals("Pass")){
                i++;
            }

            if(pof.equals("Fail") && i == 2){
                i--;
                Benchmark++;
                }
            if(Benchmark == 3){
                System.out.println("Fail");
                i = 4;
            }
            if(i ==3){
                System.out.println("Module Complete");
                break;
            }
            }
            }
        }
