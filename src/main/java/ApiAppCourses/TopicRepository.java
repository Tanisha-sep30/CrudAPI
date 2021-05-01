package ApiAppCourses;

//provide data service operation for topic class
/*import org.springframework.data.repository.CrudRepository;
this is for embeded
public interface TopicRepository extends CrudRepository<Topic,String> {
}*/

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicRepository extends JpaRepository<Topic,String>{

    //Topic findTopicBy(String Id);
    Optional<Topic> findById(String id);

}
