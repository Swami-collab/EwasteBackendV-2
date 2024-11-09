package com.Ewaste2.Ecoins2.Controller;

import com.Ewaste2.Ecoins2.Model.Coins;
import com.Ewaste2.Ecoins2.Repository.CoinsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coins")
@CrossOrigin(origins = "http://localhost:3000")
public class CoinsController {

    @Autowired
    private CoinsRepository coinsRepository;

    @PostMapping("/submit")
    public Coins submitCoins(@RequestBody Coins coins){

        return coinsRepository.save(coins);
    }


    @GetMapping("/{username}")
    public List<Coins> getCoins(@PathVariable String username) {
        return coinsRepository.findByUsername(username);
    }

}
