package pl.pjatk.gameplay.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.gameplay.model.Player;
import pl.pjatk.gameplay.service.PlayerService;

import java.util.List;

@RestController
@RequestMapping("/player") //dzięki temu jak wyszukujemy w internecie znajduje nam to co jest pod playerem
public class PlayerController {

    private PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }
    @GetMapping
    public ResponseEntity<List<Player>> findAll(){   //podajemy jaki typ danych będzię zwrócony
        return ResponseEntity.ok (playerService.findAll ());
    }
}
