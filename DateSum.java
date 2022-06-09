package datesum;

public class DateSum {


	public static int dateSum(String date) {
		try {
			String[] numbers = date.split("-");


			int sum = 0;
			for (String number: numbers) {
				sum += Integer.valueOf(number);
			}
			return sum;

		} catch(Exception e) {
			return 0;
		}
	}


	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Kein valider Input");
		}
		else {
			int sum = dateSum(args[0]);
			if (sum == 0) {
				System.out.println("Kein valider Input - Format mit '-'");
			} else {
			System.out.println("Sum of numbers in todays date: " + sum);
			}
		}

	}

}
