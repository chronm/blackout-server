package dev.chronm.blackout.blackoutserver.repository;

import dev.chronm.blackout.blackoutserver.database.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDao, String> {
    UserDao findUserById(String userId);
}
