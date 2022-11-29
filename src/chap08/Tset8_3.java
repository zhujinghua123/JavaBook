package chap08;

import java.util.Arrays;

public class Tset8_3 {
    public static void main(String[] args) {
        // Students' answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[] scores = new int[answers.length];

        for (int i = 0; i < answers.length; i++) {

            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;

            }
            scores[i] = correctCount;
        }

        int[] scores_copy = new int[scores.length];
        System.arraycopy(scores, 0, scores_copy, 0, scores.length);

        Arrays.sort(scores_copy);
        for (int a = 0; a < scores_copy.length; a++) {
            for (int b = 0; b < scores.length; b++) {
                if (scores_copy[a] == scores[b]) {
                    System.out.println("Student " + b + "'s correct count is " + scores_copy[a]);
                    scores[b] = 0;
                }
            }
        }
    }
}

