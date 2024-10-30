public class App {
    public static void main(String[] args) throws Exception {
        var orc = new Orc("ivancho");
        var human = new Human("Mihail");

        battle(orc, human);


        orc.introduce();
    }

    public static void battle(Character char1, Character char2) throws InterruptedException {
        double counter = 0;
        while(char1.isAlive() && char2.isAlive() ){
            if(counter % char1.getAttackSpeed() * 10 == 0){
                
            }

            char1.attack(char2);

            if(char2.isAlive()){
                char2.attack(char1);
            }


            Thread.sleep(100);
            counter += 0.1;
        }

        if(char1.isAlive()){
            System.out.println("Character 1 is aliave");
        }
        else {
            System.out.println("Character 2 is alive");
        }


    }


}
