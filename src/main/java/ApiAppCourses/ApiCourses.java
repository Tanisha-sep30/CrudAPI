package ApiAppCourses;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//to tell spring that this is our starting point of spring application
@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = TopicRepository.class)

public class ApiCourses { 

    public static void main(String[] args) {
        //To create servlet container and run it
        //sets up default configuration, starts spring aplication context,
        // performs class path scan, start TOMCAT server
        SpringApplication.run(ApiCourses.class, args);

    }
}
