public class Main {
    public static void main(String[] args){
        Pelanggan pelanggan1 = new Pelanggan();
        pelanggan1.Reservation = "Thoper";
        pelanggan1.Bundlecut = "grooming + shaving + Hair spa + SheetMask";
        pelanggan1.HargaBundle = "120.000";
        pelanggan1.Membership = "gold";

        System.out.println("Reservation: " + pelanggan1.Reservation);
        System.out.println("Bundlecut: " + pelanggan1.Bundlecut);
        System.out.println("Harga: " + pelanggan1.HargaBundle);
        System.out.println("Membership: " + pelanggan1.Membership);
        pelanggan1.MetodeBayar1();
         pelanggan1.MetodeBayar2();
        System.out.println();

    }
    
    
}