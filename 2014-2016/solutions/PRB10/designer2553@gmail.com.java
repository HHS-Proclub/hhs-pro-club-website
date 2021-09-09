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

	private PRB10 () {}

	private static String convertLessThanOneThousand(int number) {
		String soFar;

		if (number % 100 < 20){
			soFar = numNames[number % 100];
			number /= 100;
	    } else {
	    	soFar = numNames[number % 10];
	    	number /= 10;

	    	soFar = tensNames[number % 10] + soFar;
	    	number /= 10;
	    }
	    
		if (number == 0) return soFar;
	    return numNames[number] + " hundred" + soFar;
	}


	public static String convert(long number) {
	    // 0 to 999 999 999 999
	    if (number == 0) { return "zero"; }

	    String snumber = Long.toString(number);

	    // pad with "0"
	    String mask = "000000000000000000000";
	    DecimalFormat df = new DecimalFormat(mask);
	    snumber = df.format(number);

	    // XXXnnnnnnnnnnnnnnnnnn
	    int quintrillion = Integer.parseInt(snumber.substring(0,3));
	    // nnnXXXnnnnnnnnnnnnnnn
	    int quadrillion = Integer.parseInt(snumber.substring(3,6));
	    // nnnnnnXXXnnnnnnnnnnnn
	    int trillion = Integer.parseInt(snumber.substring(6,9));
	    // nnnnnnnnnXXXnnnnnnnnn
	    int billions = Integer.parseInt(snumber.substring(9,12));
	    // nnnnnnnnnnnnXXXnnnnnn
	    int millions  = Integer.parseInt(snumber.substring(12,15));
	    // nnnnnnnnnnnnnnnXXXnnn
	    int hundredThousands = Integer.parseInt(snumber.substring(15,18));
	    // nnnnnnnnnnnnnnnnnnXXX
	    int thousands = Integer.parseInt(snumber.substring(18,21));

	    String tradQuintrillions;
	    switch (quintrillion) {
	    case 0:
	    	tradQuintrillions = "";
	    	break;
	    case 1 :
	    	tradQuintrillions = convertLessThanOneThousand(quintrillion) + " quintrillion ";
	    	break;
	    default :
	    	tradQuintrillions = convertLessThanOneThousand(quintrillion) + " quintrillion ";
	    }
	    String result = tradQuintrillions;
	    
	    String tradQuadrillions;
	    switch (quadrillion) {
	    case 0:
	    	tradQuadrillions = "";
	    	break;
	    case 1 :
	    	tradQuadrillions = convertLessThanOneThousand(quadrillion) + " quadrillion ";
	    	break;
	    default :
	    	tradQuadrillions = convertLessThanOneThousand(quadrillion) + " quadrillion ";
	    }
	    result += tradQuadrillions;
	    
	    String tradTrillions;
	    switch (trillion) {
	    case 0:
	    	tradTrillions = "";
	    	break;
	    case 1 :
	    	tradTrillions = convertLessThanOneThousand(trillion) + " trillion ";
	    	break;
	    default :
	    	tradTrillions = convertLessThanOneThousand(trillion) + " trillion ";
	    }
	    result += tradTrillions;
	    
	    String tradBillions;
	    switch (billions) {
		    case 0:
		    	tradBillions = "";
		    	break;
		    case 1 :
		    	tradBillions = convertLessThanOneThousand(billions) + " billion ";
		    	break;
		    default :
		    	tradBillions = convertLessThanOneThousand(billions) + " billion ";
	    }
	    result +=  tradBillions;

	    String tradMillions;
	    switch (millions) {
		    case 0:
		    	tradMillions = "";
		    	break;
		    case 1 :
		    	tradMillions = convertLessThanOneThousand(millions) + " million ";
		    	break;
		    default :
		    	tradMillions = convertLessThanOneThousand(millions) + " million ";
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
		    	tradHundredThousands = convertLessThanOneThousand(hundredThousands) + " thousand ";
	    }
	    result =  result + tradHundredThousands;

	    String tradThousand;
	    tradThousand = convertLessThanOneThousand(thousands);
	    result =  result + tradThousand;

	    // remove extra spaces!
	    return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
	}

	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		try {
			String snum = in.next().replace(",", "");
			
			if (snum.contains(".")) {
				String[] side = snum.split("\\.");
				long left = Long.parseLong(side[0]);
				String s = convert(left) + " point ";
				
				for (int i = 0; i < side[1].length(); i++) {
					int oneDigit = side[1].charAt(i) - 48;
					s += convert(oneDigit) + " ";
				}
				
				s = s.trim();
				System.out.println(s);
			} else {
				long num = Long.parseLong(snum);
				System.out.println(convert(num));
			}
		} finally {
			in.close();
		}
	}

}
