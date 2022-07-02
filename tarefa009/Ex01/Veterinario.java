public class Veterinario {
    
    public void examinar(Animal animal) {

        if(animal.toString().equals("cachorro")) {
            animal.somAnimal();
        }

        if(animal.toString().equals("cavalo")) {
            animal.somAnimal();
        }

        if(animal.toString().equals("preguica")) {
            animal.somAnimal();
        }
    }
}
