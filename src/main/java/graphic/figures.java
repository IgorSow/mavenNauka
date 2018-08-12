package graphic;

enum Figures {
    KWADRAT(1),
    KOLO(2),
    TROJKAT(3);

    private final int value;

    private Figures(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
