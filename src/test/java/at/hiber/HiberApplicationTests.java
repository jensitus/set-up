package at.hiber;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("dev")
@Import(TestHiberApplication.class)
@Slf4j
class HiberApplicationTests {

    @Autowired
    private HiberService hiberService;

    @Test
    void contextLoads() {
        Hiber hiber = new Hiber();
        hiber.setName("Donner");
        Hiber createdHiber = hiberService.createHiber(hiber);
        log.info("  *  *  *  *  *  *  *  hiber name {}, id {}", createdHiber.getName(), createdHiber.getId());
    }

}
