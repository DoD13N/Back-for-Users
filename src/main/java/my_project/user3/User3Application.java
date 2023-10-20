package my_project.user3;

import my_project.user3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import my_project.user3.repository.UserRepository;

@SpringBootApplication
public class User3Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(User3Application.class, args);
    }

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String...args)throws Exception{
        this.userRepository.save(new User("Den","Dobychin","denis@mail.ru"));
        this.userRepository.save(new User("Alena","Dobychina","alena@mail.ru"));
        this.userRepository.save(new User("Alisa","Dobychina","alice@mail.ru"));}
}
