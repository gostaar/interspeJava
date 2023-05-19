package fr.studi.interspe.repository;

import fr.studi.interspe.pojo.*;
import org.springframework.data.geo.GeoResult;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface AdherentRepository extends CrudRepository<Adherents,Long> {
    @Query("SELECT a FROM Adherents a")
    List<Adherents> findAllAdherent();
}