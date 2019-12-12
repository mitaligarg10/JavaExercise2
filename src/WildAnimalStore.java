public class WildAnimalStore {

    WildAnimal wildAnimal;

    public int[] animalEnqueueStore(int data) {
        return wildAnimal.animalEnqueue(data);

    }

    public void animalDequeueStore() {

        wildAnimal.animalDequeue();
    }

    public int[] animalDisplayStore() {
        //wildAnimal= new WildAnimal();
        return wildAnimal.animalDisplay();
    }

    public void animalSizeStore(int size) {

        wildAnimal = new WildAnimal(size);
    }


}
