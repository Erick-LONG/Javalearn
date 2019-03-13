package reflact;


import demo1.Person;

import java.lang.reflect.Constructor;

public class reflactdemo {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;

        Constructor constructor = personClass.getConstructor();
        System.out.println(constructor);
        Object pers = constructor.newInstance();
        System.out.println(pers);
        Person per1 = personClass.newInstance();
        System.out.println(per1);


    }
}
