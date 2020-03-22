package homework8.part2;

import java.util.*;
import java.util.stream.Collectors;

import static homework8.part2.GenerateData.getEmployees;

@SuppressWarnings({"unused"})
class StreamOperations {

    List<Person> findPersonsEverWorkedInEpam() {
        List<Employee> employees = getEmployees();

        return employees.stream()
                .filter(employee -> employee.getJobHistory().stream().anyMatch(jhe -> jhe.getCompany().equals("EPAM")))
                .map(Employee::getPerson)
                .collect(Collectors.toList());

    }

    List<Person> findPersonsBeganCareerInEpam() {
        List<Employee> employees = getEmployees();
        return employees.stream()
                .filter(employee -> employee.getJobHistory().get(0).getCompany().equals("EPAM"))
                .map(Employee::getPerson)
                .collect(Collectors.toList());
    }

    Set<String> findAllCompanies() {
        List<Employee> employees = getEmployees();
        return employees.stream()
                .map(Employee::getJobHistory)
                .flatMap(Collection::stream)
                .map(JobHistoryEntry::getCompany)
                .collect(Collectors.toSet());
    }

    Integer findMinimalAgeOfEmployees() {
        List<Employee> employees = getEmployees();

        return employees.stream()
                .map(Employee::getPerson)
                .map(Person::getAge)
                .min(Integer::compareTo).orElse(0);
    }

    Double calcAverageAgeOfEmployees() {
        List<Employee> employees = getEmployees();
        OptionalDouble average = employees.stream()
                .mapToInt(employee -> employee.getPerson().getAge())
                .average();
        return average.isPresent()?average .getAsDouble():null;
    }

    Person findPersonWithLongestFullName() {
        List<Employee> employees = getEmployees();
              return employees.stream()
                .map(Employee::getPerson)
                .max(Comparator.comparingInt(person -> person.getLastName().length() + person.getFirstName().length()))
                .orElse(null);
    }

    Employee findEmployeeWithMaximumDurationAtOnePosition() {
        List<Employee> employees = getEmployees();
        return employees.stream()
                .max(Comparator.comparingInt(employee -> Objects.requireNonNull(employee.getJobHistory().stream()
                        .max(Comparator.comparingInt(JobHistoryEntry::getDuration)).orElse(null)).getDuration()))
                .orElse(null);
    }
}