package functional.programming;

public class Main {
    public static void main(String[] args) {

        StringTransformer transformer1 = new StringTransformer() {
            @Override
            public String transform(String s) {
                return s.trim().toUpperCase();
            }
        };
        StringTransformer transformer2 = s -> s.trim().toUpperCase();
        StringTransformer transformer3 = s -> s.toLowerCase();

        System.out.println(transform(transformer2, "Hello world!"));
        System.out.println(transform(transformer3, "Hello world!"));


    }

    private static String transform(StringTransformer transformer, String line){
        return transformer.transform(line);
    }
}
interface StringTransformer {
    String transform(String s);
}
