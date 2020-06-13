package kapitel6;

import kapitel3.model.AudiQ5;

import java.lang.reflect.Field;

public class IntrospectionBeispiel {
    public static void main(String[] args) throws Exception {
        AudiQ5 q5 = new AudiQ5();
        Field f = q5.getClass().getDeclaredField("i");
        f.setAccessible(true);
        System.out.println(f.get(q5));
        f.set(q5, 78123);
        System.out.println(f.get(q5));

        Class<?> aClass = Class.forName("kapitel1.EinheitenUmrechnen");
        Object o = aClass.newInstance();
        kapitel1.EinheitenUmrechnen object = (kapitel1.EinheitenUmrechnen) o;
        System.out.println(object);
    }
}
