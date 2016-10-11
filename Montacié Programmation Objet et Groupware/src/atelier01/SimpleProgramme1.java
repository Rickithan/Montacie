package atelier01;

public class SimpleProgramme1 {
	public static void main(String[] args) {
		String phrase = "Bonjour mon nom est Claude Montacié";
		System.out.println(phrase);
		String mots[] = phrase.split(" ");
		for (String s : mots)
			System.out.println(s);
	}
}