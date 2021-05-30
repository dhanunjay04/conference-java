import com.dhanunjay.repository.HibernateSpeakerRepositoryImpl;
import com.dhanunjay.repository.SpeakerRepository;
import com.dhanunjay.service.SpeakerService;
import com.dhanunjay.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//        service.setRepository(getSpeakerRepository());
        return service;
    }
    @Bean(name = "speakerrepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
}
