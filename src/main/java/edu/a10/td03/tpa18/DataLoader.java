package edu.a10.td03.tpa18;


import edu.a10.td03.tpa18.model.Eleves;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import edu.a10.td03.tpa18.repository.ElevesRepository;


@Component
public class DataLoader implements CommandLineRunner {

    private final ElevesRepository elevesRepository;

    public DataLoader(ElevesRepository elevesRepository) {
        this.elevesRepository = elevesRepository;
    }

    @Override
    public void run(String... args) {
        elevesRepository.save(new Eleves(null, "Joseph1", "Kalera", "Programmeur"));
        elevesRepository.save(new Eleves(null, "Loic", "Ranely", "Comptable"));
        elevesRepository.save(new Eleves(null, "Chaouki", "Chaouki", "Entrepreneur"));
        elevesRepository.save(new Eleves(null, "Test4", "Test5", "LolLol"));
        elevesRepository.save(new Eleves(null, "Kevin", "Ranely", "Acteur"));
        System.out.println("Les donnees des eleves sont init !");
    }
}