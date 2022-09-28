package game.behaviour;

public interface IHealth {
    int getHealth();

    void reduceHealth(int damageAmount);

    void heal(int healAmount);
}
