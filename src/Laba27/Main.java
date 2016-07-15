package Laba27;
// тест редактирования
public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Samsung", 120, "AB1234567CD");
        Device device2 = new Device("Samsung", 120, "AB1234567CD");
        Device device3 = new Device("Samsung", 150, "AB1234569CD");

        Monitor monitor1 = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        Monitor monitor2 = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        Monitor monitor3 = new Monitor("Samsung", 150, "AB1234567CD", 1024, 720);

        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("Samsung", 120, "AB1234567CD", 400, "VF545");
        EthernetAdapter ethernetAdapter2 = new EthernetAdapter("Samsung", 120, "AB1234567CD", 400, "VF545");
        EthernetAdapter ethernetAdapter3 = new EthernetAdapter("Samsung", 120, "AB1234567CD", 300, "VF333");


        System.out.println(device1.toString());
        System.out.println(monitor1.toString());
        System.out.println(ethernetAdapter1.toString());

        System.out.println("1-й.Device - " + device1.hashCode());
        System.out.println("2-й.Device - " + device2.hashCode());
        System.out.println("3-й.Device - " + device3.hashCode());
        System.out.println("Первый и второй Девайсы одинаковые? - " + device1.equals(device2));
        System.out.println("Первый и третий Девайсы одинаковые? - " + device1.equals(device3));
        System.out.println("1-й.Monitor - " + monitor1.hashCode());
        System.out.println("2-й.Monitor - " + monitor2.hashCode());
        System.out.println("3-й.Monitor - " + monitor3.hashCode());
        System.out.println("Первый и второй Мониторы одинаковые? - " + monitor1.equals(monitor2));
        System.out.println("Первый и третий Мониторы одинаковые? - " + monitor1.equals(monitor3));
        System.out.println("1-й.EthernetAdapter - " + ethernetAdapter1.hashCode());
        System.out.println("2-й.EthernetAdapter - " + ethernetAdapter2.hashCode());
        System.out.println("3-й.EthernetAdapter - " + ethernetAdapter3.hashCode());
        System.out.println("Первый и второй Адапреры одинаковые? - " + ethernetAdapter1.equals(ethernetAdapter2));
        System.out.println("Первый и третий Адапреры одинаковые? - " + ethernetAdapter1.equals(ethernetAdapter3));


        //Массив разнотипных объектов
        Device[] devicesArr = {device1, device2, device3, monitor1, monitor2, monitor3, ethernetAdapter1, ethernetAdapter2, ethernetAdapter3};
        for (Device device : devicesArr) {
            System.out.println(device.toString());

        }


    }
}
