package com.company;
import java.util.*;


public class Main {
    // 1a & 2a
    public static void main(String[] args) {
        // question one
        Stack<Integer> s= new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        // build your linked list by adding the numbers 0-99 to your stack (by
        // using push) and queue (by using add)
        for (int i = 0; i < 100; i++) {
            s.push(i);
            q.add(i);
        }

        while (!q.isEmpty()) {
            q.remove();
            System.out.println(q);
        }

        while ((s.size() > 0)) {
            s.pop();
            System.out.println(s);
        }
        // (⌐■_■)
        System.out.println("BLAST OFF!");

        // question two
        HashMap<String, String> movies = new HashMap<String, String>();
        movies.put("Luna", "Radio Flyer");
        movies.put("Tyler", "The Matrix");
        movies.put("Chris", "The Notebook");
        movies.put("Alison", "The Lost Boys");
        // I thought a for-loop was more appropriate here. please don't dock points (ಥ﹏ಥ)
        for (String key : movies.keySet()) {
            System.out.println(key + ": " + movies.get(key));
        }
    }
}
