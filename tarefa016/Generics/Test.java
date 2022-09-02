package tarefa016.Generics;

public class Test<T> {

    T obj;

    public Test(T obj) {
        this.obj = obj;
    }

    public void printar() {
        System.out.println(obj);
    }

    public static void main(String[] args) throws Exception {
        Test<Integer> inteiro = new Test<>(2);
        inteiro.printar();
        Test<Double> decimal = new Test<>(2.0);
        decimal.printar();
        Test<String> palavra = new Test<>("Sou uma String");
        palavra.printar();
    }
}