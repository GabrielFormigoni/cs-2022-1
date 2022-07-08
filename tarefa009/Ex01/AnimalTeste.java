public class AnimalTeste {
    
    public static void main(String[] args) {

        Animal cachorro = new Cachorro();
        Animal cavalo = new Cavalo();
        Animal preguica = new Preguica();
        Veterinario veterinario = new Veterinario();

        System.out.println("\n\nConsulta som animais");
        cachorro.somAnimal();
        cavalo.somAnimal();
        preguica.somAnimal();

        System.out.println("\n\nExaminar os animais");
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

    }
}
