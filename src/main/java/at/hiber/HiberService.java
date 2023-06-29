package at.hiber;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HiberService {
    private final HiberRepo hiberRepo;

    public Hiber createHiber(Hiber hiber) {
        return hiberRepo.save(hiber);
    }

}
