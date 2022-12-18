public class Main {
    public static void main(String[] args) {
      /*Cat myrzik = new Cat ("Мурзик", 3);
       // myrzik.meow();
        Cat begemot = new Cat("Бегемот",1);
        //begemot.meow();
        System.out.println("У кота " + myrzik.name + " " + myrzik.getFriends().length + " друзей");
        myrzik.addFriend(begemot);
        System.out.println("У кота " + myrzik.name + " " + myrzik.getFriends().length + " друзей");
        myrzik.friends[0].meow();*/


         Human Maxim = new Human(1988,"Максим","Минск","бренд-менеджером");
         Human Anay = new Human(1993,"Аня","Москва","методистом образовательных программ");
         Human Kathia = new Human(1992, "Катя", "Калинингад", "продакт-менеджером");
         Human Arthem = new Human(1995, "Артем", "Москва","директором по развитию бизнеса");

         Maxim.greetings();
        Anay.greetings();
        Kathia.greetings();
        Arthem.greetings();


    }
}