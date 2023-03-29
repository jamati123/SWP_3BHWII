package Enums;



// Date: 2018-01-10
class spasMitEnums {
    enum Tageszeit {MORGEN, MITTAG, ABEND, NACHT};
    public static void main(String[] args) {
        Tageszeit t = Tageszeit.MORGEN;
        System.out.println(t);
    }
}
