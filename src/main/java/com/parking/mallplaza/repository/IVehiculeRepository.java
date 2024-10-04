package com.parking.mallplaza.repository;

import com.parking.mallplaza.model.Commerce;
import com.parking.mallplaza.model.Vehicule;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehiculeRepository extends Neo4jRepository<Commerce, Long> {

    @Query("MERGE (:Vehicule {licencePlate:$licencePlate, color:$color, brand:$brand, model:$model })")
    void saveVehicule(@Param("licencePlate") String licencePlate, @Param("color") String color,
                      @Param("brand") String brand,
                      @Param("model") String model);

    @Query("MERGE (:Owner {numberIdentification:$numberIdentification, name:$name, lastName:$lastName })")
    void saveOwner(@Param("numberIdentification") int numberIdentification,@Param("name") String name, @Param("lastName") String lastName);

    @Query("MERGE (:Commerce {nameCommerce:$nameCommerce, timeIngress:$timeIngress })")
    void saveCommerce(@Param("nameCommerce") String nameCommerce, @Param("timeIngress") String timeIngress);
}
