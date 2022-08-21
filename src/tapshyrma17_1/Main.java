package tapshyrma17_1;

public class Main {

    public static void main(String[] args) {
        Cow cow1 = new Cow("cow1", 5, 98.45, "female");
        Cow cow2 = new Cow("cow2", 4, 92.45, "female");
        Cow cow3 = new Cow("cow3", 5, 79.35, "female");
        Cow cow4 = new Cow("cow4", 6, 89.87, "female");
        Cow cow5 = new Cow("cow5", 4, 85.45, "female");
        Sheep sheep1 = new Sheep("sheep1", 3, 64.56, "male");
        Sheep sheep2 = new Sheep("sheep2", 4, 59.56, "female");
        Sheep sheep3 = new Sheep("sheep3", 4, 59.56, "male");
        Horse horse1 = new Horse("horse1", 6, "white", 121.34, "female");
        Horse horse2 = new Horse("horse2", 7, "white", 120.76, "male");

        AbstractAnimal[] farms = {cow1, cow2, cow3, cow4, cow5, sheep1, sheep2, sheep3, horse1, horse2};
        for (AbstractAnimal farm : farms) {
            switch (farm.getClass().getSimpleName()) {
                case "Cow" -> {
                    System.out.println("Nick name: " + ((Cow) farm).getNickName());
                    System.out.println("Age: " + ((Cow) farm).getAge());
                    System.out.println("Weight: " + ((Cow) farm).getWeight());
                    System.out.println("Gender: " + ((Cow) farm).getGender());
                    System.out.println("---------------------------------------");
                }
                case "Sheep" -> {
                    System.out.println("Nick name: " + ((Sheep) farm).getNickName());
                    System.out.println("Age: " + ((Sheep) farm).getAge());
                    System.out.println("Weight: " + ((Sheep) farm).getWeight());
                    System.out.println("Gender: " + ((Sheep) farm).getGender());
                    System.out.println("---------------------------------------");
                }
                case "Horse" -> {
                    System.out.println("Nick name: " + ((Horse) farm).getNickName());
                    System.out.println("Age: " + ((Horse) farm).getAge());
                    System.out.println("Color: " + ((Horse) farm).getColor());
                    System.out.println("Weight: " + ((Horse) farm).getWeight());
                    System.out.println("Gender: " + ((Horse) farm).getGender());
                    System.out.println("---------------------------------------");
                }
            }
        }
        Cow cow6 = new Cow("cow6", 4, 85.45, "female");
        Sheep sheep4 = new Sheep("sheep4", 3, 64.56, "male");
        Horse horse3 = new Horse("horse3", 6, "white", 121.34, "female");

        AbstractAnimal[] farm = {};
    }
}
