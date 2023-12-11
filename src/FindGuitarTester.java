

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(  Builder.FENDER,  "Stratocastor", 6,
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        List matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar)i.next();
                GuitarSpec spec = guitar.getGuitarSpec();
                System.out.println("  We have a " +
                        spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + " guitar:\n     " +
                        spec.getBackWood() + " back and sides,\n     " +
                        spec.getTopWood() + " top.\n  You can have it for only $" +
                        guitar.getPrice() + "!\n  ----");

            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    public static void initializeInventory(Inventory inventory) {
        inventory.addGuitar(new Guitar("11277", 3999.95,
                new GuitarSpec(Builder.COLLINGS, "CJ", 6, Type.ACOUSTIC,
                        Wood.INDIAN_ROSEWOOD, Wood.SITKA)));
        inventory.addGuitar(new Guitar("V95693", 1499.95,
                new GuitarSpec(Builder.FENDER, "Stratocastor", 6, Type.ELECTRIC,
                        Wood.ALDER, Wood.ALDER)));
        inventory.addGuitar(new Guitar("V9512", 1549.95,
                new GuitarSpec(Builder.FENDER, "Stratocastor",6,  Type.ELECTRIC,
                        Wood.ALDER, Wood.ALDER)));
        inventory.addGuitar(new Guitar("122784", 5495.95,
                new GuitarSpec(Builder.MARTIN, "D-18", 6, Type.ACOUSTIC,
                        Wood.MAHOGANY, Wood.ADIRONDACK)));
        inventory.addGuitar(new Guitar("76531", 6295.95,
                new GuitarSpec(Builder.MARTIN, "OM-28", 6, Type.ACOUSTIC,
                        Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK)));
        inventory.addGuitar(new Guitar("70108276", 2295.95,
                new GuitarSpec(Builder.GIBSON, "Les Paul", 6, Type.ELECTRIC,
                        Wood.MAHOGANY, Wood.MAHOGANY)));
        inventory.addGuitar(new Guitar("82765501", 1890.95,
                new GuitarSpec(Builder.GIBSON, "SG '61 Reissue", 6,Type.ELECTRIC,
                        Wood.MAHOGANY, Wood.MAHOGANY)));
        inventory.addGuitar(new Guitar("77023", 6275.95,
                new GuitarSpec(Builder.MARTIN, "D-28", 6,Type.ACOUSTIC,
                        Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK)));
        inventory.addGuitar(new Guitar("1092", 12995.95,
                new GuitarSpec(Builder.OLSON, "SJ", 12, Type.ACOUSTIC,
                        Wood.INDIAN_ROSEWOOD, Wood.CEDAR)));
        inventory.addGuitar(new Guitar("566-62", 8999.95,
                new GuitarSpec(Builder.RYAN, "Cathedral", 12, Type.ACOUSTIC,
                        Wood.COCOBOLO, Wood.CEDAR)));
        inventory.addGuitar(new Guitar("6 29584", 2100.95,
                new GuitarSpec(Builder.PRS, "Dave Navarro Signature",6, Type.ELECTRIC,
                        Wood.MAHOGANY, Wood.MAPLE)));
    }
}
