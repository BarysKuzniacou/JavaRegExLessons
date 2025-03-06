import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

	public static void main(String[] args) {
		System.out.println("myemail@mail.ru".matches("")); // пустой паттерн
		System.out.println("".matches("")); // пустой паттерн с пустой строкой
		System.out.println("myemail@mail.ru".matches("\\b[A-Za-z0-9._%+-]"
				+ "+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b")); // проверка email
		System.out.println("abracadabra".matches("\\b[A-Za-z0-9._%+-]"
				+ "+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b")); // паттерн для проверки email для строки не соответсвующей email
		
		Pattern p1 = Pattern.compile("a"); // паттерн
		Matcher m1 = p1.matcher("Jack is a boy"); // паттерн сверяется со строчкой
		while(m1.find()) { // проверяется наличие вхождения паттерна в строку
			System.out.println(m1.start() + " " + m1.group() + " ");
		}
		
		
		Pattern p2 = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b"); // паттерн
		Matcher m2 = p2.matcher("my email is myemail@mail.ru"); // паттерн сверяется со строчкой
		while(m2.find()) { // проверяется наличие вхождения паттерна в строку
			System.out.println(m2.start() + " " + m2.group() + " ");
		//5-19 https://www.youtube.com/watch?v=WOYyYwNj7TU&list=PL786bPIlqEjQsE_WAcKpkZ-Q4T-A8j1D2&index=1
		}
	}

}
