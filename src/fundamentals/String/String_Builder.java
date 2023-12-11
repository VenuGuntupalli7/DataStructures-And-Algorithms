package fundamentals.String;

public class String_Builder {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);

        }
        System.out.println(builder);
        builder.append('c');
        builder.insert(2,'e');
        builder.reverse();
        System.out.println(builder.indexOf("v"));
        System.out.println(builder);
                                      //By using StringBuilder we don't need to create String object in heap for 25 times,
    }                                 // Instead, it's only changing the original object(StringBuilder()) that was already created
                                      //StringBuilder is mutable, it's like array we can alter the values even though once we created it! not like Strings
}
