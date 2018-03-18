package myPackage;

import java.util.Scanner;
import myPackage.Questions.IntQuestion;

import myPackage.Questions.AdditionQuestion;
import myPackage.Questions.SubtractionQuestion;
import myPackage.Questions.GeneralQuestion;

/** 
 * @author daono
 *This program creates, administers and grades a quizz
 *In this quizz there are simple questions that can be
 *addition questions,
 *subtraction questions,
 *and more general questions.
 *All the answers must be an int
 */
public class MainQuizz {

	private static IntQuestion[] questions;

	private static int[] nb1;
	private static int[] nb2;
	private static int[] rep;

	public static void main(String[] args) {
		quizz();
		admin();
		note();
	}

	/**
	 * This program defines 10 questions of the quizz
	 */
	private static void quizz() {
		nb1 = new int[10];
		nb2 = new int[10];
		questions = new IntQuestion[10];

		for (int i = 0; i < 7; i++)

		{
			if (Math.random() < 0.5)
				questions[i] = new AdditionQuestion();

			else
				questions[i] = new SubtractionQuestion();

			nb1[i] = (int) (Math.random() * 50 + 1);
			nb2[i] = (int) (Math.random() * 50 + 1);

			questions[7] = new GeneralQuestion("How old was Stephen Hawking when he passed away?", 76);
			questions[8] = new GeneralQuestion("What is the number of bad luck ?", 13);
			questions[9] = new GeneralQuestion("What is the number of luck?", 7);
		}
	}

/**
 * This program administers the quizz
 * It gets the users answers for each question	
 */
	private static void admin() {
		Scanner scan = new Scanner(System.in);
		rep = new int[10];
		for (int i = 0; i < 10; i++) {
			int questionNum = i + 1;
			System.out.printf("Question %2d:  %s ", questionNum, questions[i].getQuestion());
			rep[i] = Integer.parseInt(scan.nextLine());
		}
		scan.close();
	}

/**
 * This program grades the quizz
 * 
 */
	private static void note() {
		int nbrepok = 0;
		for (int i = 0; i < 10; i++) {
			if (rep[i] == questions[i].getCorrectAnswer()) {
				System.out.println("Question " + (i + 1) + " Bravo, bonne réponse !");
				nbrepok++;
			} else {
				System.out.println("Question " + (i + 1) + " " + "Oups ! Mauvaise reponse ");
			}

		}
		nbrepok = nbrepok * 10;
		System.out.println("Votre note finale est " + nbrepok + "/100");
	}
}
