package ApiAppCourses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TopicController {
    @Autowired
    TopicServices topicServices;

    @RequestMapping(path = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello";
    }

    @RequestMapping(path ="/Topic",method = RequestMethod.GET)//Mapped to the url
    public List<Topic> getAllTopic(){
        return topicServices.getAllTopics();
    }

    @RequestMapping(path ="/Topic/{id}",method = RequestMethod.GET)
    public Topic getTopic(@PathVariable String id){
        return topicServices.getTopic(id);
    }

    @RequestMapping(path ="/TopicP",method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic){
        topicServices.addTopic(topic);
    }

    @RequestMapping(path ="/Topic/{id}",method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id){
        topicServices.updateTopic(id,topic);
    }

    @RequestMapping(path ="/Topic/{id}",method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id){
        topicServices.deleteTopic(id);
    }





}
