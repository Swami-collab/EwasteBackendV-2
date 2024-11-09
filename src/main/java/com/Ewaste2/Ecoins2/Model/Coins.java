package com.Ewaste2.Ecoins2.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.PrePersist;
import java.util.Date;

@Entity
public class Coins {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String companyname;
    private String username;
    private int battery_bite_coins;
    private int circuits_coins;
    private int coins;
    private String name;
    private String battery_bite_weight;
    private String circuits_weight;

    @Temporal(TemporalType.TIMESTAMP)  // Store both date and time
    private Date createdDate;  // The field to hold the creation date

    // The method below will automatically set the createdDate before the entity is saved
    @PrePersist
    public void prePersist() {
        if (createdDate == null) {
            createdDate = new Date();  // Set current date and time
        }
    }

    // Getters and Setters
    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCircuits_weight() {
        return circuits_weight;
    }

    public void setCircuits_weight(String circuits_weight) {
        this.circuits_weight = circuits_weight;
    }

    public String getBattery_bite_weight() {
        return battery_bite_weight;
    }

    public void setBattery_bite_weight(String battery_bite_weight) {
        this.battery_bite_weight = battery_bite_weight;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getCircuits_coins() {
        return circuits_coins;
    }

    public void setCircuits_coins(int circuits_coins) {
        this.circuits_coins = circuits_coins;
    }

    public int getBattery_bite_coins() {
        return battery_bite_coins;
    }

    public void setBattery_bite_coins(int battery_bite_coins) {
        this.battery_bite_coins = battery_bite_coins;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
