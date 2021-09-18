public abstract class Element {
    private final String Symbol;
    private final int atomicNumber;
    private final double atomicWeight;
    private final String name;

    public Element(String symbol, int atomicNumber, double atomicWeight, String name) {
        Symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
        this.name = name;
    }

    public abstract void describeElement();

    @Override
    public String toString() {
        return "Symbol : " + Symbol +
                "\natomicNumber : " + atomicNumber +
                "\natomicWeight : " + atomicWeight +
                "\nname : " + name + "\n\n";
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return Symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }
}
