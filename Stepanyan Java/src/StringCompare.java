public class StringCompare {
    private final String a;
    private final String b;

    public StringCompare(String first, String second) {
        this.a = first;
        this.b = second;
    }

    public void compareStrings() {
        if (a.equals(b))
            System.out.println("Строки идентичны");

        if (!a.equals(b))
            System.out.println("Строки неидентичны");
    }
}
