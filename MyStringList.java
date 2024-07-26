public class MyStringList implements StringList {
    private String[] array;
    private int pos;

    MyStringList() {
        array = new String[5];
        pos = 0;
    }

    @Override
    public void add(String string) {
        if (pos < array.length) {
            array[pos] = string;
            pos++;
        } else {
            String[] temp = new String[array.length*2];
            for (int i = 0; i < array.length; i++) temp[i] = array[i];
            temp[pos] = string;
            pos++;
            array = temp;
        }
    }

    @Override
    public boolean isEmpty() {
        return pos == 0;
    }

    @Override
    public int size() {
        return pos;
    }

    @Override
    public boolean contains(String string) {
        for (int i = 0; i < pos; i++) 
            if (array[i].equals(string)) return true;
        return false;
    }

    @Override
    public String get(int i) {
        return array[i];
    }

    @Override
    public void clear() {
        for (int i = 0; i < pos; i++) array[i] = null;
        pos = 0;
    }
}
