
public class Main {
    public static void main(String[] args) {

        Pair<Integer, String> hi = new Pair<>(5, "Hi");
        System.out.println(hi.first());
        System.out.println(hi.last());

        hi.getFirst();
        hi.getSecond();
        hi.swap();
        hi.getFirst();
        hi.getSecond();
        System.out.println(hi);

        String hello = "hello";
        String greetings = hello.replaceFirst("l", "9");
        System.out.println(greetings);

        System.out.println(Pair.replaceLast("hello", "ll", "rr"));
    }
}
