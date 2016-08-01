package tommy.lim;

/**
 * Created by IE on 6/7/2016.
 */
public class getTotalPOAmount {

    public static void main(String[] args){
        Item cp = new Item(1, "cellphone", 12345.6f, "gadget");

        PO cp1 = new PO(32131241, 412f, "Pieces", cp);

        System.out.println("Item ID: " + cp.getItemid());
        System.out.println("Item Desccription: " + cp.getItemdescription());
        System.out.println("Item Type: " + cp.getItemtype());
        System.out.println("Price: " + cp.getPrice());
        System.out.println("UOM: " + cp1.getUOM());

        System.out.println("PO Number: " + cp1.getPonumbers());
        System.out.println("Quantity: " + cp1.getQuantity());
        System.out.println("Total Price: " + cp1.getTotalPOAmount());


    }
}
