import java.text.DecimalFormat;
import java.util.Scanner;

public class PRB10 {

	private static final String[] tensNames = {
			"",
			" ten",
			" twenty",
			" thirty",
			" forty",
			" fifty",
			" sixty",
			" seventy",
			" eighty",
			" ninety"
	};

	private static final String[] numNames = {
			"",
			" one",
			" two",
			" three",
			" four",
			" five",
			" six",
			" seven",
			" eight",
			" nine",
			" ten",
			" eleven",
			" twelve",
			" thirteen",
			" fourteen",
			" fifteen",
			" sixteen",
			" seventeen",
			" eighteen",
			" nineteen"
	};

	private static String convertLessThanOneThousand(int number) {
		String soFar;

		if (number % 100 < 20){
			soFar = numNames[number % 100];
			number /= 100;
		}
		else {
			soFar = numNames[number % 10];
			number /= 10;

			soFar = tensNames[number % 10] + soFar;
			number /= 10;
		}
		if (number == 0) return soFar;
		return numNames[number] + " hundred" + soFar;
	}

	public static String convert(double number) {
		long num = (int)number;
		String result = convert(num);
		String n = Double.toString(number);
		int i = n.indexOf('.');
		n = n.substring(i+1, n.length());
		result += " point ";
		for(int a = 0; a < n.length(); a++) {
			if(n.charAt(a) == '1') {
				result += " one ";
			}
			else if(n.charAt(a) == '2') {
				result += " two ";
			}
			else if(n.charAt(a) == '3') {
				result += " three ";
			}
			else if(n.charAt(a) == '4') {
				result += " four ";
			}
			else if(n.charAt(a) == '5') {
				result += " five ";
			}
			else if(n.charAt(a) == '6') {
				result += " six ";
			}
			else if(n.charAt(a) == '7') {
				result += " seven ";
			}
			else if(n.charAt(a) == '8') {
				result += " eight ";
			}
			else if(n.charAt(a) == '9') {
				result += " nine ";
			}
			else if(n.charAt(a) == '0') {
				result += " zero ";
			}
		}
		result = result.trim();
		return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
	}


	public static String convert(long number) {
		// 0 to 999 999 999 999
		if (number == 0) { return "zero"; }

		String snumber = Long.toString(number);

		// pad with "0"
		String mask = "000000000000";
		DecimalFormat df = new DecimalFormat(mask);
		snumber = df.format(number);

		// XXXnnnnnnnnn
		int billions = Integer.parseInt(snumber.substring(0,3));
		// nnnXXXnnnnnn
		int millions  = Integer.parseInt(snumber.substring(3,6));
		// nnnnnnXXXnnn
		int hundredThousands = Integer.parseInt(snumber.substring(6,9));
		// nnnnnnnnnXXX
		int thousands = Integer.parseInt(snumber.substring(9,12));

		String tradBillions;
		switch (billions) {
		case 0:
			tradBillions = "";
			break;
		case 1 :
			tradBillions = convertLessThanOneThousand(billions)
			+ " billion ";
			break;
		default :
			tradBillions = convertLessThanOneThousand(billions)
			+ " billion ";
		}
		String result =  tradBillions;

		String tradMillions;
		switch (millions) {
		case 0:
			tradMillions = "";
			break;
		case 1 :
			tradMillions = convertLessThanOneThousand(millions)
			+ " million ";
			break;
		default :
			tradMillions = convertLessThanOneThousand(millions)
			+ " million ";
		}
		result =  result + tradMillions;

		String tradHundredThousands;
		switch (hundredThousands) {
		case 0:
			tradHundredThousands = "";
			break;
		case 1 :
			tradHundredThousands = "one thousand ";
			break;
		default :
			tradHundredThousands = convertLessThanOneThousand(hundredThousands)
			+ " thousand ";
		}
		result =  result + tradHundredThousands;

		String tradThousand;
		tradThousand = convertLessThanOneThousand(thousands);
		result =  result + tradThousand;

		// remove extra spaces!
		return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
	}

	/**
	 * testing
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		str = str.replaceAll(",", "");
		if(str.contains(".")) {
			double d = Double.parseDouble(str);
			System.out.println(convert(d));
		}
		else {
			int i = Integer.parseInt(str);
			System.out.println(convert(i));
		}

			/*
			 *** zero
			 *** one
			 *** sixteen
			 *** one hundred
			 *** one hundred eighteen
			 *** two hundred
			 *** two hundred nineteen
			 *** eight hundred
			 *** eight hundred one
			 *** one thousand three hundred sixteen
			 *** one million
			 *** two millions
			 *** three millions two hundred
			 *** seven hundred thousand
			 *** nine millions
			 *** nine millions one thousand
			 *** one hundred twenty three millions four hundred
			 **      fifty six thousand seven hundred eighty nine
			 *** two billion one hundred forty seven millions
			 **      four hundred eighty three thousand six hundred forty seven
			 *** three billion ten
			 **/
	}
}
