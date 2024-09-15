public class SmartphoneAdapter implements PowerOutlet{
    private SmartphoneCharger smartPhoneCharger;

    public SmartphoneAdapter(SmartphoneCharger smartPhoneCharger){
        this.smartPhoneCharger = smartPhoneCharger;
    }

    @Override
    public String plugIn() {
        return smartPhoneCharger.chargePhone();
    }
}