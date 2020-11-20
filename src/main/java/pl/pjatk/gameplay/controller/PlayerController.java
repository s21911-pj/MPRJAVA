package pl.pjatk.gameplay.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.gameplay.model.Player;
import pl.pjatk.gameplay.service.PlayerService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/player") //dzięki temu jak wyszukujemy w internecie znajduje nam to co jest pod playerem
public class PlayerController {

    private PlayerService playerService;

    public PlayerController(PlayerService playerService) {//wstrzykiwanie zależności
        this.playerService = playerService;
    }

    @GetMapping
    public ResponseEntity<List<Player>> findAll() {   //podajemy jaki typ danych będzię zwrócony
        return ResponseEntity.ok (playerService.findAll ());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Player> findbyId(@PathVariable Long id) {   //podajemy jaki typ danych będzię zwrócony
        Optional<Player> byId = playerService.findById (id);
        if (byId.isPresent ()) {
            return ResponseEntity.ok (byId.get ());
        } else {
            return ResponseEntity.notFound ().build ();
        }
    }

    @PostMapping("/add")
    public ResponseEntity<Player> savePlayer(@RequestBody Player player) {
        return ResponseEntity.ok (playerService.savePlayer (player));
    }

    @DeleteMapping("/{id}/remove")
    public ResponseEntity<Void> deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer (id);
        return ResponseEntity.ok ().build ();
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<Player> updatePlayer(@PathVariable Long id,@RequestBody Player player){
        return ResponseEntity.ok (playerService.updatePlayer(id, player));
    }
    @GetMapping("/attacker/{​​attackerId}​​/defender/{​​defenderId}​​")
    public ResponseEntity<Player> attackPlayer(@PathVariable Long attackerId, @PathVariable Long defenderId){
        return ResponseEntity.ok(playerService.attack(attackerId, defenderId));
    }
}
