import java.util.ArrayList;
import java.util.List;

public class ElementArray {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        Element element1 = new MetalElement("Be", "Beryllium", 4, 0.0122);
        elements.add(element1);
        Element element2 = new MetalElement("Li", "Lithium", 3, 6.94);
        elements.add(element2);
        Element element3 = new MetalElement("Ca", "Calcium", 20, 40.078);
        elements.add(element3);

        Element element4 = new NonMetalElement("H", "Hydrogen", 1, 1.008);
        elements.add(element4);
        Element element5 = new NonMetalElement("He", "Helium", 2, 4.0026);
        elements.add(element4);
        Element element6 = new NonMetalElement("Ne", "Neon", 10, 20.180);
        elements.add(element4);

        System.out.println(elements.get(1));
        System.out.println(elements.get(5));

        element1.describeElement();
    }
}
