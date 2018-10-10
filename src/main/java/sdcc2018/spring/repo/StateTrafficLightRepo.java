package sdcc2018.spring.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sdcc2018.spring.domain.StateTrafficLight;

import java.util.ArrayList;

@Repository
public interface StateTrafficLightRepo extends MongoRepository<StateTrafficLight, String> {

    StateTrafficLight findByid(String id);
    ArrayList<StateTrafficLight> findAll();
}
