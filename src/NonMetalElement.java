public class NonMetalElement extends Element{
    public NonMetalElement(String symbol, String name,  int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight, name);
    }

    @Override
    public void describeElement() {
        System.out.println("NonMetal : \n");
        System.out.println("In chemistry, a nonmetal is a chemical element that is mechanically weak in its most stable form,\n" +
                " brittle if solid, and usually gains or shares electrons in chemical reactions. There is no universal agreement\n" +
                " on which elements are nonmetals; the numbers generally range from fourteen to twenty-three, depending on the\n" +
                " criterion or criteria of interest.\n" +
                "\n" +
                "Typical nonmetals lack the shiny appearance of metals; have relatively low melting points, boiling points,\n" +
                " and densities; and are poor conductors of heat and electricity. Chemically, they tend to have higher values\n" +
                " of ionization energy, electron affinity, and electronegativity; negative or positive oxidation states in\n" +
                " compounds (whereas metals nearly always have positive oxidation states); and their oxides tend to be acidic.\n" +
                " They form many more compounds than do metals.[3] Most or some nonmetals share a range of other properties;\n" +
                " a few have properties that are anomalous.\n" +
                "\n" +
                "Different kinds of nonmetals include noble gases; halogens; elements such as silicon, which are sometimes\n" +
                " instead called metalloids; and unclassified nonmetals. Metalloids are included given their predominately (weak)\n" +
                " nonmetallic chemistry. Unclassified nonmetals, such as sulfur, are moderately nonmetallic, on a net basis. Halogens,\n" +
                " such as bromine, are characterized by stronger nonmetallic properties and a tendency to form predominantly ionic compounds\n" +
                " with metals. Noble gases such as xenon are distinguished by their reluctance to form compounds.\n");
    }
}
