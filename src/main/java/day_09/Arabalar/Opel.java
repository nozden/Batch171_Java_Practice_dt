package day_09.Arabalar;

public class Opel extends Araba{

    String hiz="Opel arabalar max 220km hız yapar";

    String marka="Opel";

    String sirketMerkezi="Almanya";

    @Override
    protected void motor(){
        //parent classtaki motor methodunu override yaptık
        //yani opel classı için motor methodunu guncelledik
        System.out.println("Opel arabala Opel marka motor kullanır");

    }

    protected void garanti(){
        System.out.println("Opel arabalar 2yil garantilidir");
    }


}
