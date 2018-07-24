package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Olya on 16.07.2018.
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
      //  HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      //  obj.getMessege();
      //  System.out.println("~~~~~~~~~~~~~~Wait~~~~~~~~~~~~~~");
      //  Thread.sleep(5000);
     //   HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld2");
     //   obj1.getMessege();
     //   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
     //   HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld3");
      //  obj2.getMessege();
     //   HelloWorld obj3 = (HelloWorld) context.getBean("helloWorld5");
      //  List<Integer> myList = obj3.getMyList();
      //  for (int i = 0; i < myList.size(); i++) {
      //      System.out.println(myList.get(i));
      //  }
      //  HelloWorld obj4 = (HelloWorld) context.getBean("helloWorld6");
      //  Set<String> mySet = obj4.getMySet();
      //  for (String a: mySet) {
      //      System.out.println(a);
      //  }
       // HelloWorld obj5 = (HelloWorld) context.getBean("helloWorld7");
      //  Map<Integer, String> myMap=obj5.getMyMap();
       // for (Map.Entry<Integer, String> a: myMap.entrySet()) {
      //      System.out.println(a.getKey() + a.getValue());
      //  }
      // Kitchen obj = (Kitchen) context.getBean("kitchen");
      //    obj.get();
      //  System.out.println("1111111111111111111111111111111111");
      //  Thread.sleep(5000);
      //  Kitchen obj1 = (Kitchen) context.getBean("kitchen1");
      //  obj1.get();
      //  System.out.println("22222222222222222222222222222222222");
      //  Kitchen obj2 = (Kitchen) context.getBean("kitchen2");
      //  obj2.get();
      //  System.out.println("33333333333333333333333333333333333");
      //  Kitchen obj3 = (Kitchen) context.getBean("kitchen3");
      //  obj2.get();
      //  System.out.println("List``````List```````List```````List`````List");
      //  Kitchen obj4 =(Kitchen)context.getBean("kitchen4");
      //  List<String> plates= obj4.getPlates();
      //  for (String a:plates) {
      //      System.out.println(a);
      //  }
      //  System.out.println("Set~~~~~~~Set~~~~~~~Set~~~~~~~Set~~~~~~~Set");
      //  Kitchen objSet=(Kitchen)context.getBean("kitchen5");
      //  Set<String> set=objSet.getCutlery();
      //  for (String a: set
     //        ) {
      //      System.out.println(a);
     //   }
      //  System.out.println("Map~~~~~~~Map~~~~~~~Map~~~~~~~Map~~~~~~~Map~~~~~~~Map");
      //  Kitchen objMap = (Kitchen)context.getBean("kitchen6");
      //  Map<String,String> map = objMap.getFrig();
     //   for (Map.Entry<String,String> a:map.entrySet()
      //       ) {
     //       System.out.println(a.getKey()+ a.getValue());
      //  }

        ApplicationContext context1 = new ClassPathXmlApplicationContext("beansAutowired.xml");
        Reader reader=(Reader) context1.getBean("ReaderBean");
        System.out.println(reader);
    }

}
