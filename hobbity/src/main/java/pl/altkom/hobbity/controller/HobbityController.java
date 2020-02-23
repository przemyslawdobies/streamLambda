package pl.altkom.hobbity.controller;

import org.springframework.web.bind.annotation.*;
import pl.altkom.hobbity.model.Hobbity;
import pl.altkom.hobbity.repository.HobbitRepository;

@RestController
public class HobbityController {

    private final HobbitRepository hobbitRepository;

    public HobbityController(HobbitRepository hobbitRepository) {
        this.hobbitRepository = hobbitRepository;
    }

    /*@GetMapping("/wszystkie-hobbity")
    public Object wszystkieHobbity() {
        return null;
    }
*/
    @GetMapping ("/wszystkie-hobbity")
    public Iterable<Hobbity> wszystkieHobbity(){
        return hobbitRepository.findAll();
    }
    @PostMapping("/hobbity")
    public void dodajHobbita(@RequestBody Hobbity hobbit) {
        hobbitRepository.save(hobbit);
    }
    @GetMapping("/hobbity/{id}")
    public Hobbity pobierzHobbita(@PathVariable Long id) {
        // don't do it at work! ;)
        return hobbitRepository.findById(id).get();
    }

}
