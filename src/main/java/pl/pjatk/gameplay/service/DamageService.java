package pl.pjatk.gameplay.service;

import pl.pjatk.gameplay.model.Player;

public class DamageService {
    public Player defend (Player defender, Player attacker) {
        int newHealth;
        Player defenderPlayer = defender;
        Player attackerPlayer = attacker;

        newHealth = defenderPlayer.getHealth ()-attackerPlayer.getDamage();
        if (newHealth < 0){
            newHealth = 0;
        }
        defenderPlayer.setHealth (newHealth);
        return defender;
    }
}
