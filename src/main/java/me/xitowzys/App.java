package me.xitowzys;

import me.xitowzys.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        try (Session session = sessionFactory.getCurrentSession()) {

            session.beginTransaction();


            Person person = session.get(Person.class, 2);
//            person.setName("New name");
//            session.remove(person);
//            List<Person> people = session.createSelectionQuery("FROM Person WHERE age > 20", Person.class).getResultList();
//
//            for (Person per: people) {
//                System.out.println(per);
//            }

            session.createQuery("UPDATE Person SET name='Test New' WHERE age < 30", null).executeUpdate();

//            List<Person> personList = new ArrayList<Person>();
//
//            for (int i = 0; i < 3; i++) {
//                personList.add(new Person("Test " + 1, 10 * (i + 1)));
//            }
//
//            for (Person person: personList) {
//                session.persist(person);
//            }


//            Person person = session.get(Person.class, 1);
//
//            System.out.println(person.toString());

            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }


    }
}
