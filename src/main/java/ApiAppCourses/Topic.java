package ApiAppCourses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //make table of topic instance

public class Topic {
    @Id   //to make primary key
    private String id;
    private String name;
    private String discription;

    public Topic() {
    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.discription = discription;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String description) {
        this.discription = description;
    }
}

