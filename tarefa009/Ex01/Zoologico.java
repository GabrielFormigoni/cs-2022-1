public class Zoologico {

    public static void main(String[] args) {

    Animal[] jaula = new Animal[10];

    jaula[0] = new Cachorro();
    jaula[1] = new Cavalo();
    jaula[2] = new Cachorro();
    jaula[3] = new Preguica();
    jaula[4] = new Cavalo();
    jaula[5] = new Cachorro();
    jaula[6] = new Preguica();
    jaula[7] = new Cachorro();
    jaula[8] = new Cavalo();
    jaula[9] = new Preguica();

    for(int i = 0; i < jaula.length; i++) {

        jaula[i].somAnimal();
        if(jaula[i].toString().equals("cachorro") || jaula[i].toString().equals("cavalo")){
            jaula[i].formaLocomocao();
        }
    }
    


    }
}
