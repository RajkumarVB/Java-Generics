import java.util.ArrayList;
import java.util.Date;

public class JavaGenericBasic {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Date());
        list.add("Rajkumar");
        list.add(22);
        String name = (String) list.get(1);
        System.out.println(name);
//        String anotherName = (String) list.get(0);
//        The above will give a RunTime error
    }
}
