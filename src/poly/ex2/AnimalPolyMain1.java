package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
       Animal[] animalArr = {new Dog(), new Cat(), new Cow()};

       for(Animal animal : animalArr) {
           soundAnimal(animal);
       }
    }

    private static void soundAnimal(Animal animal){
        System.out.println("동물소리테스트시작");
        animal.sound();
        System.out.println("동물소리테스트종료");
    }
}
