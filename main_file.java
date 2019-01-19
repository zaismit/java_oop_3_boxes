package java_oop_3_boxes;

public class main_file
{
    public static void main (String[] args)
    {
        box myfirstbox;

        myfirstbox = new box();

        myfirstbox.color    = "green";
        myfirstbox.height   = 40;
        myfirstbox.lenght   = 50;
        myfirstbox.width    = 100;

        int volumeofmyfirstbox = myfirstbox.height * myfirstbox.lenght * myfirstbox.width;

        System.out.println( volumeofmyfirstbox + " " + myfirstbox.color);

        box mysecondbox;

        mysecondbox = new box();

        mysecondbox.color   ="red";
        mysecondbox.height  = 5;
        mysecondbox.lenght  = 70;
        mysecondbox.width   = 10;

        int volumeofmysecondbox = mysecondbox.height * mysecondbox.lenght * mysecondbox.width;

        System.out.println( volumeofmysecondbox + " " + mysecondbox.color);

        box mythirdbox;

        mythirdbox = new box();

        mythirdbox.color   ="white";
        mythirdbox.height  = 53;
        mythirdbox.lenght  = 750;
        mythirdbox.width   = 120;

        int volumeofmythirdbox = mythirdbox.height * mythirdbox.lenght * mythirdbox.width;

        System.out.println( volumeofmythirdbox + " " + mythirdbox.color);

    }
}
