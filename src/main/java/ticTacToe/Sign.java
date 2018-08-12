package ticTacToe;

public enum Sign {
    X(1),
    O(2),
    _(0);

    int value;
    String kindSing;

    public int getValue() {
        return value;
    }

    public String getKindSing() {
        return kindSing;
    }

    Sign(int value) {
        this.kindSing = kindSing;
        this.value = value;
    }


}
