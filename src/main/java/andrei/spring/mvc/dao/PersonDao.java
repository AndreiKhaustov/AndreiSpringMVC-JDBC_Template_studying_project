package andrei.spring.mvc.dao;

import andrei.spring.mvc.models.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDao {
    private static int count;
    private List<Person> people;
    {
        people = new ArrayList<>();
        people.add(new Person(++count, "Andrei"));
        people.add(new Person(++count, "Maxim"));
        people.add(new Person(++count, "David"));
    }
    public List<Person> index() {
        return people;
    }
    public Person show(int id){
        return people.stream().filter(person -> person.getId()==id).findAny().orElse(null);
    }
    public void save(Person person) {
        person.setId(++count);
       people.add(person);

    }
    public void update(int id, Person updatedPerson){
         Person personToBeUpdated = show(id);
         personToBeUpdated.setName(updatedPerson.getName());
    }
}
