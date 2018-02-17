package com.example;

@Component
public class PersonClient {

  @Autowired
  Dao<Person> personDao;

  public void process() {
      List<Person> list = PersonDao.loadAll();
      System.out.println("Loaded all: " + list);

      Person person = Person.create("Dana", "Whitley", "464 Gorsuch Drive");
      System.out.println("saving: "+person);
      PersonDao.save(person);

      person = Person.create("Robin", "Cash", "64 Zella Park");
      System.out.println("saving: "+person);
      PersonDao.save(person);

      List<Person> list2 = PersonDao.loadAll();
      System.out.println("Loaded all: " + list2);

  }
}
