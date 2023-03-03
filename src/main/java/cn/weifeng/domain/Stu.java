package cn.weifeng.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stu implements Comparator<Stu> {

    private Integer id;

    private String name;

    private Integer age;

    @Override
    public int compare(Stu o1, Stu o2) {
        return o1.getId() != o2.getId() ? o1.getId() - o2.getId() : o2.getAge() - o1.getAge();
    }


    public static void main(String[] args) {
        List<Stu> stuList = new ArrayList<>();
        stuList.add(new Stu(1, "2", 2));
        stuList.add(new Stu(3, "2", 1));
        stuList.add(new Stu(2, "2", 3));
        stuList.add(new Stu(2, "2", 6));
        stuList.add(new Stu(0, "2", 4));
        stuList.add(new Stu(7, "2", 5));
        stuList.add(new Stu(6, "2", 9));

        stuList.sort(new Stu());
        System.out.println(stuList);
    }
}
