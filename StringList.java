public interface StringList {
    boolean isEmpty();

    int size();

    boolean contains(String string);

    String get(int i);

    void add(String string);

    void clear();
}
