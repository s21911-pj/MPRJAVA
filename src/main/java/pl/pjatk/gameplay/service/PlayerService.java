package pl.pjatk.gameplay.service;

import org.springframework.stereotype.Service;
import pl.pjatk.gameplay.model.Player;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    public List<Player> findAll(){
     //   List<Player> players = new ArrayList<> ();
     //   Player playerOne = new Player();
    //        players.add (playerOne);
     //   players.add (playerTwo);
     //   return players;
        return List.of (new Player (1,"Player one",10,100),new Player (2,"Player two",10,100));
    }
}
