package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Andy on 25.03.2017.
 */
public class CalculateInterestService implements JavaDelegate {

    private Person p1 = new Person("Andy", 26);
    private Person p2 = new Person("Peter", 55);
    private Person p3 = new Person("Seb", 27);
    private List<Person> persons = new ArrayList<Person>(Arrays.asList(new Person[]{p1, p2, p3}));
    private static int numberOfAddedPersons = 0;


    public void execute(DelegateExecution delegateExecution) throws Exception {
        Person person = (Person) delegateExecution.getVariable("person");
        System.out.println("Spring Bean invoked by " + person.getName() + ", who is " + person.getAge() + " years old");
    }

    public List<String> getNames() {
        return Arrays.asList(new String[]{"Andy", "Peter", "Seb"});
    }

    public List<Person> getPersons() {
        //this.persons.add(new Person("Dieter",20));
        return persons;
    }

    public boolean hasChanged(DelegateExecution execution) {
        Integer nrOfInstances = (Integer) execution.getVariable("nrOfInstances");
        if (nrOfInstances != this.persons.size()) {
            return true;
        }
        return false;
    }

    public void ex() {
        int x = 0;
        throw new BpmnError("Error_PersonSizeChanged");
    }

    public void add() {
        Person p = new Person("Person " + numberOfAddedPersons, 20);
        this.persons.add(p);
        numberOfAddedPersons++;
    }

    public void out(DelegateExecution execution, Person person) {
        System.out.println(person.getName());
    }

}
