public class Pair<K, T> {
    private K first;
    private T last;

    Pair(K first, T last) {
        this.first = first;
        this.last = last;
    }

    public K first() {
        return first;
    }

    public T last() {
        return last;
    }

    public void swap() {
        K hi = first;
        first = (K) last;
        last = (T) hi;
    }

    public static String replaceLast(String text, String regex, String replacement) {
        return text.replaceFirst("(?s)(.*)" + regex, "$1" + replacement);
    }

    public void getFirst() {
    }

    public void getSecond() {
    }
}

