package homeworks.newYearHolidays.immutableClass;

public class ImmutableClass {

    public void run() {
        WordNotSparrow word = new WordNotSparrow("shit", "Mom");

        System.out.println(word.getPerson() + " said " + word.getWord());
        System.out.println("Now " + word.getPerson() + " wants to change it!");
        System.out.println("Was " + word.getPerson() + " successful? The word is still " + word.getWord());

        System.out.println("The only way to change it - is to create a new one!");
        word = new WordNotSparrow("aGoodWord", "Mom");
        System.out.println(word.getPerson() + " said " + word.getWord());
    }
}