class device{
    void power_on(){
        System.out.println("Power on...");
    }
}
class laptop extends device{
    void boot(){
        System.out.println("Booting..");
    }
}
class gaming_laptop extends laptop{
    void start_gaming(){
        System.out.println("PUBG GAMING...");
    }
}
void main(){
    device d = new device();
    d.power_on();
    laptop l = new laptop();
    l.boot();
    gaming_laptop g = new gaming_laptop();
    g.start_gaming();
}

