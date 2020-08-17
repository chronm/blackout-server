package dev.chronm.blackout.blackoutserver.repository;

import dev.chronm.blackout.blackoutserver.database.HomeDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<HomeDao, String> {

    HomeDao findTop1By();
}
