import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WildAnimalStoreTest {
    private WildAnimalStore wildAnimalStore;

    @Before
    public void setUp() {
        wildAnimalStore = new WildAnimalStore();
        wildAnimalStore.animalSizeStore(4);
    }

    @After
    public void tearDown() {
        wildAnimalStore = null;
    }

    @Test
    public void animalEnqueueStore_GivenInteger_ShouldReturnTheInsertedInteger() {
        int arr[] = {100, 200, 300, 400};
        wildAnimalStore.animalEnqueueStore(100);
        wildAnimalStore.animalEnqueueStore(200);
        wildAnimalStore.animalEnqueueStore(300);
        wildAnimalStore.animalEnqueueStore(400);
        Assert.assertArrayEquals(arr, wildAnimalStore.animalDisplayStore());
    }

    @Test
    public void animalDequeue_ShouldDeleteTheFirstNode() {
        int arr[] = {200, 300, 400};
        wildAnimalStore.animalEnqueueStore(100);
        wildAnimalStore.animalEnqueueStore(200);
        wildAnimalStore.animalEnqueueStore(300);
        wildAnimalStore.animalEnqueueStore(400);
        wildAnimalStore.animalDequeueStore();
        Assert.assertArrayEquals(arr, wildAnimalStore.animalDisplayStore());


    }

}
