package matei.spring.petclinic.services.map;

import matei.spring.petclinic.model.Specialty;
import matei.spring.petclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtyService {
    @Override
    public Specialty findById(Long aLong) {
        return null;
    }

    @Override
    public Specialty save(Specialty object) {
        return null;
    }

    @Override
    public Set<Specialty> findAll() {
        return null;
    }

    @Override
    public void delete(Specialty object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
