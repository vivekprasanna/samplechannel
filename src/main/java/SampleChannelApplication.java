import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan
@EnableJpaRepositories
@EnableAutoConfiguration
public class SampleChannelApplication {
    public static void main(String[] args) {
        if(args.length == 0) {
            SpringApplication.run(SampleChannelApplication.class);
        } else {
            SpringApplication.run(SampleChannelApplication.class, args);
        }
    }
}
