public class MetalElement extends Element{
    public MetalElement(String symbol,String name, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight, name);
    }

    @Override
    public void describeElement() {
        System.out.println("Metal : \n");
        System.out.println("A metal (from Greek μέταλλον métallon, \"mine, quarry, metal\") is a material that,\n" +
                " when freshly prepared, polished, or fractured, shows a lustrous appearance,\n" +
                " and conducts electricity and heat relatively well.\n" +
                " Metals are typically malleable (they can be hammered into thin sheets) or ductile (can be drawn into wires).\n" +
                " A metal may be a chemical element such as iron; an alloy such as stainless steel;\n" +
                " or a molecular compound such as polymeric sulfur nitride.\n" +
                "\n" +
                "In physics, a metal is generally regarded as any substance capable of conducting electricity at a\n" +
                " temperature of absolute zero.[1] Many elements and compounds that are not normally classified as\n" +
                " metals become metallic under high pressures. For example, the nonmetal iodine gradually becomes\n" +
                " a metal at a pressure of between 40 and 170 thousand times atmospheric pressure.\n" +
                " Equally, some materials regarded as metals can become nonmetals. Sodium, for example,\n" +
                " becomes a nonmetal at pressure of just under two million times atmospheric pressure.\n" +
                "\n" +
                "In chemistry, two elements that would otherwise qualify (in physics) as brittle metals—arsenic and\n" +
                " antimony—are commonly instead recognised as metalloids due to their chemistry\n" +
                " (predominantly non-metallic for arsenic, and balanced between metallicity and nonmetallicity for antimony).\n" +
                " Around 95 of the 118 elements in the periodic table are metals (or are likely to be such).\n" +
                " The number is inexact as the boundaries between metals, nonmetals, and metalloids fluctuate slightly\n" +
                " due to a lack of universally accepted definitions of the categories involved.\n" +
                "\n");
    }
}
