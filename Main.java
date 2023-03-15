package Str;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String[] arrayStr = {"P01|Nguyen|Van A|01/01/1990|Ha Noi|0|Ha Noi", "P02|Tran|Thi B|02/02/1991|Hai Phong|1|Hai Phong"};
		ArrayList<Person> persons = Person.parse(arrayStr);
		for (Person person : persons) {
			System.out.println(person.toString());
		}
	}

}
