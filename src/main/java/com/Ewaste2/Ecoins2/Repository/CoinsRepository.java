package com.Ewaste2.Ecoins2.Repository;

import com.Ewaste2.Ecoins2.Model.Coins;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoinsRepository extends JpaRepository<Coins, Integer> {

    List<Coins> findByUsername(String username);
}
