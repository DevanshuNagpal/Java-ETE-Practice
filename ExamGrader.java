import java.util.Scanner;


public class ExamGrader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int numStudents = in.nextInt();
        in.nextLine();  // Consume the newline character

        String[] marks = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            marks[i] = in.nextLine();
        }

        for (int student = 0; student < numStudents; student++) {
            int correctCount = gradeExam(keys, marks[student]);
            System.out.println(correctCount);
        }

        in.close();
    }

    private static int gradeExam(char[] keys, String studentAnswers) {
        int correct = 0;
        for (int i = 0; i < keys.length; i++) {
            if (i < studentAnswers.length() && studentAnswers.charAt(i) == keys[i]) {
                correct++;
            }
        }
        return correct;
    }
}

/*
You are a Computer Science teacher at a local high school. Your students have just taken a multiple-choice exam, and you need to grade their exams using a Java program. Each student's exam consists of 10 questions, and the answer choices for each question are labeled A, B, C, D, and E.
You have the following data:
The students' answers, stored in a 2D array char[][] answers, where each row corresponds to a student and each column corresponds to a question.
The correct answers, stored in an array char[] keys, where each element represents the correct answer for a question.
Your task is to write a Java program that grades each student's exam and prints the correct count of answers for each student.


Answer Key : char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};


Input Format
First line of program will prompt the user to enter the number of students taking the exam.
For each student, the program will prompt the user to enter their answers for each of the 10 questions.
Output Format
Output consists line separated integer values, i.e. count of correct answers for each student


Explanation:
Input:
8
A B A C C D E E A D
D B A B C A E E A D
E D D A C B E E A D C B A E D C E E A D
A B D C C D E E A D
B B E C C D E E A D B B A C C D E E A D

E B E C C D E E A D


Output: 7
6
5
4
8
7
7
7



Sample Input1:
2
A B A C C D E E A D D B A B C A E E A D

Sample Output1:
7
6








 */