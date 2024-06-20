package coreJava;

import java.util.List;
import java.util.Optional;

public class Java18 {


    public static void main(String[] args) {
        System.out.println("hello Java 18");
        String s = "hello world";
        System.out.println(formatpatternswitch(s));

        Optional<String> optional = Optional.ofNullable(null);
        String result = optional.orElse("default");
        System.out.println(result);

        // VAR Keyword

        var list = List.of("apple", "orange", "banana");
        System.out.println(list);


        // Using text blocks to define a multiline string
        String html = """
                <html>
                    <head>
                        <title>Hello, World!</title>
                    </head>
                    <body>
                        <h1>Hello, World!</h1>
                        <p>This is a sample HTML document.</p>
                    </body>
                </html>
                """;

        System.out.println(html);
    }

    static String formatpatternswitch(Object obj) {

        return switch (obj) {
            case Integer i -> String.format("int %d", i);
            case String s -> String.format("String %s", s);
            default -> obj.toString();

        };
    }
}



