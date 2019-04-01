public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
            // instance of tim kiem tra trong animal co Chicken khong
            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal; // ep kieu chuyen ve kieu du lieu edible
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] =  new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit: fruits){
            System.out.println(fruit.howToEat());
        }

    }
}
