package Inheritance;
import java.util.ArrayList;
import java.util.Scanner;

/**
This program shows a simple quiz with one question.
 */
public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		Question q = new Question();
		q.setText("Who was the inventor of Java?");
		q.setAnswer("James Gosling");

		q.display();
		System.out.print("Your answer: ");
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));
	}
}