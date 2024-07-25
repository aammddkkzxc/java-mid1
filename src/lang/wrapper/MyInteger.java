package lang.wrapper;

public class MyInteger {
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int compareValue) {
        if (value < compareValue) {
            return -1;
        }
        if (value > compareValue) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
