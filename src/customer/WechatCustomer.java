package customer;

public class WechatCustomer {
    public String address; //
    public boolean takeout; // true代表外卖，false代表堂食

    public WechatCustomer(String address, boolean takeout) {
        this.address = address;
        this.takeout = takeout;
    }
}