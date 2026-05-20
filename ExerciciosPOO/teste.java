class Animal {
    public void emitirSom() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {
    @Override  // ← "Estou sobrescrevendo o método da classe Animal"
    public void emitirSom() {
        System.out.println("Au au!");
    }
}