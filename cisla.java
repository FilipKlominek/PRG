package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class cisla {

    public static void main(String[] args) {
        int sum = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("in.txt"));

            for (int i = 0; i < 50001; i++) {
                String in = br.readLine();
                String[] a = in.split(" ");
                String ch = a[0];
                int num = Integer.parseInt(a[1]);

                if (ch.equals("P")) {
                    sum += num;
                } else sum -= num;
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Unable to read file...");
        }
        System.out.println(sum);
    }
}
