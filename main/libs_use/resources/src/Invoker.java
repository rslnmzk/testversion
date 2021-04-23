package src;

public class Invoker extends Character {
    public Invoker() {
        this.name = "Invoker";
        this.hp = 500;
    }

    public void sunstrike(Character character) {
        System.out.println("Даю санстрайк по " + character.name);
        character.hp-=100;
    }
}
