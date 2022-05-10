package Demo;

public class PhoneDemo {
    public static void main (String [] args){
        Phone phone1 = new Phone("8 962 915 6825","Nokia",180.25);
        Phone phone2 = new Phone("8 915 000 5212", "Apple");
        Phone phone3 = new Phone ();

       /*
       phone1.number = "8 962 915 6825";
        phone1.model = "Nokia";
        phone1.weight = 180.25;

        phone2.number = "8 915 000 5212";
        phone2.model = "Apple";
        phone2.weight = 225.4;
        */

        System.out.println(phone1.getNumber());
        System.out.println(phone1.model);
        System.out.println(phone1.weight);
        System.out.println();

        System.out.println(phone2.getNumber());
        System.out.println(phone2.model);
        System.out.println(phone2.weight);
        System.out.println();

        System.out.println(phone3.getNumber());
        System.out.println(phone3.model);
        System.out.println(phone3.weight);
        System.out.println();

        phone1.receiveCall("Мама ");
        phone2.receiveCall("Папа ");
        phone2.receiveCall("Сестра ", "8 902 988 6655");



    }
}
