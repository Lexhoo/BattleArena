public class Arena {
    public static void main(String[] args){
        Monster broly = new Monster("broly",8, 50);
        Monster joytaro = new Monster("Joytaro", 5, 50);

        while (broly.getLife() > 0 && joytaro.getLife() > 0) {
            String attaqueDeBroly = broly.attack(joytaro);
            System.out.println(attaqueDeBroly);
            String attaqueDeJoytaro = joytaro.attack(broly);
            System.out.println(attaqueDeJoytaro);
            if(broly.getLife() <= 0) {
                System.out.println("JOYTARO is Da Winner !!!!");
            }else if(joytaro.getLife() <= 0) {
                System.out.println("BROLY is Da Winner !!!!");

            }

        }

    }
}
