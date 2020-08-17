package dev.chronm.blackout.blackoutserver.database;

import dev.chronm.blackout.blackoutserver.users.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "user")
@NoArgsConstructor
public class UserDao {

    @Id
    private String id;
    private String name;

    public UserDao(User user) {
        this.id = user.getId();
        this.name = user.getName();
    }

    public User toUser() {
        return new User(id, name);
    }
}
