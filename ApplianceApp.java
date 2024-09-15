public class ApplianceApp {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        PowerOutlet laptopRc = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refRc = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet phoneRc = new SmartphoneAdapter(smartphoneCharger);

        System.out.println(laptopRc.plugIn());
        System.out.println(refRc.plugIn());
        System.out.println(phoneRc.plugIn());
    }
}