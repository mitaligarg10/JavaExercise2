

public class Animal {

    public static void main(String[] args) {

        WildAnimalStore wildAnimalStore = new WildAnimalStore();
        wildAnimalStore.animalSizeStore(5);
        wildAnimalStore.animalDisplayStore();
        wildAnimalStore.animalEnqueueStore(10);
        wildAnimalStore.animalEnqueueStore(20);
        wildAnimalStore.animalEnqueueStore(30);
        wildAnimalStore.animalEnqueueStore(40);
        wildAnimalStore.animalEnqueueStore(50);
       // wildAnimalStore.queueEnqueue(60);
        wildAnimalStore.animalDisplayStore();
        wildAnimalStore.animalDequeueStore();
        wildAnimalStore.animalDequeueStore();
        System.out.printf("\n\nafter node deletion\n\n");
        wildAnimalStore.animalDisplayStore();
    }
}
