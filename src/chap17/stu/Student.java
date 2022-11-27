package chap17.stu;


import java.io.Serial;
import java.io.Serializable;

/**
 * @Description 用户
 * @Author 住京华
 * @Date 2022/11/22
 */
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 67896584396578439L;
    //姓名
    private String name;
    //分数
    private float score;

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", score=" + score;
    }
}
