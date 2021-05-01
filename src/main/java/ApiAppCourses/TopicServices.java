package ApiAppCourses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@Service
public class TopicServices {

     @Autowired
     TopicRepository topicRepository;

   /* List<Topic> topics = new ArrayList<>(Arrays.asList(

            new Topic("S", "Spring", "Spring Description"),
            new Topic("J", "JAVA", "JAVA Description"),
            new Topic("C", "C", "C Description")


    ));*/

    public List<Topic> getAllTopics() {

       // return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics :: add);
        return topics;
    }


   public Topic getTopic(String id) {
//        for (int i = 0; i < topics.size(); i++) {
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)) {
//                return topics.get(i);
//            }
//        }

       return topicRepository.getOne(id);

    }

    public void addTopic(Topic topic) {
       // topics.add(topic);
        topicRepository.save(topic);
    }


    public void updateTopic(String id, Topic topic) {
//        for (int i = 0; i < topics.size(); i++) {
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.set(i,topic);
//                return;
//            }
//        }
        topicRepository.save(topic);
    }


    public void deleteTopic(String id) {
//        for (int i = 0; i < topics.size(); i++) {
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.remove(t);
//                return;
//            }
//        }
        topicRepository.deleteById(id);

    }
}

