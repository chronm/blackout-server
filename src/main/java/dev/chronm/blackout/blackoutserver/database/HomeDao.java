package dev.chronm.blackout.blackoutserver.database;

import dev.chronm.blackout.blackoutserver.home.model.Home;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "home")
@NoArgsConstructor
public class HomeDao {

    @Id
    private String id;
    private String name;

    public HomeDao(Home home) {
        this.id = home.getId();
        this.name = home.getName();
    }

    public Home toHome() {
        return new Home(id, name);
    }
}
