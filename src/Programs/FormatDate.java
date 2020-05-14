package Programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("after formatting the date " + formatter.format(today));

	}
}
