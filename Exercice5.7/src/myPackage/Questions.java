package myPackage;

/**
 * 
 * @author daono
 *This program defines the different types of questions
 *There can be addition questions,
 *substraction questions,
 *but also more general questions
 */
public class Questions {
	interface IntQuestion {
		public String getQuestion();

		public int getCorrectAnswer();
	}

	/**
	 * @author daono
	 *This program allows you to create a simple Addition question
	 *with 2 random numbers
	 */
	static class AdditionQuestion implements IntQuestion {
		private int nb1, nb2; 
		
		
		public AdditionQuestion() { 
			nb1 = (int) (Math.random() * 50 + 1);
			nb2 = (int) (Math.random() * 50);
		}

		public String getQuestion() {
			return "What is " + nb1 + " + " + nb2 + " ?";
		}

		public int getCorrectAnswer() {
			return nb1 + nb2;
		}
	}
	/**
	 * @author daono
	 *This program allows you to create a simple Subtraction question
	 *with 2 random numbers
	 *and it exchanges the two numbers in order to have a positive result
	 */
	static class SubtractionQuestion implements IntQuestion {
		private int nb1, nb2; 

		public SubtractionQuestion() { 
			nb1 = (int) (Math.random() * 50 + 1);
			nb2 = (int) (Math.random() * 50);
			if (nb2 > nb1) {
				int temp = nb1;
				nb1 = nb2;
				nb2 = temp;
			}
		}

		public String getQuestion() {
			return "What is " + nb1 + " - " + nb2 + " ?";
		}

		public int getCorrectAnswer() {
			return nb1 - nb2;
		}

	}
/**
 * 
 * @author daono
 *This programs allows you to create a more General question
 */
	public static class GeneralQuestion implements IntQuestion {
		private String question;
		private int answer;
/**
 * 
 * @param question is a general question
 * @param answer is the answer to that question and must be an int
 */
		public GeneralQuestion(String question, int answer) {
			this.question = question;
			this.answer = answer;
		}

		public String getQuestion() {
			return question;
		}

		public int getCorrectAnswer() {
			return answer;
		}
	}
}
