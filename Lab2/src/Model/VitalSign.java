/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Eve Dou
 */
//public 表示这个类对整个项目都能访问。VitalSign类名首字母大写。
public class VitalSign {
    String date;
    float temperature;
    double bloodPressure;
    int pulse;
//每一个VitalSign对象都有一个自己的isConscious。
    boolean isConscious;
//这些变量是私有数据储存容器，等着被getter/setter方法访问或修改。
    
    //public 任何地方都能用这个方法。
    //String 是方法的返回值类型，说明会返回一个字符串。
    //getDate 方法名
    //return date 把data这个变量的值返回给调用它的地方。
    //作用：别人可以调用vitalSign.getDate()来拿到日期。
    public String getDate() {
        return date;
    }

    
    //void 这个方法没有返回值。
    //setDate()方法名
    //（String date）括号里的date是传进来的参数。
    //this.date是类里面的属性，右侧单独的date是传进来的参数，表示把参数值存进属性。
    //作用：别人可以调用vitalSign.setDate("2025-09-03")来更新日期。
    public void setDate(String date) {
        this.date = date;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    //对于boolean类型，Java通常用isXxx（）来代替getXxx()。
    //因为变量名字本来就是isConscious，所以getter就变成了isIsConscious。
    //return isConscious就是把对象里面保存的那个布尔属性isConscious的当前值交出去。
    public boolean isIsConscious() {
        return isConscious;
    }

    //void：不返回值，只做事。
    //（boolean isConscious）参数，调用时必须传true或false进来。
    public void setIsConscious(boolean isConscious) {
        this.isConscious = isConscious;
    //this.isConscious指这个对象里的成员变量。右侧的isConsicous是方法的参数值。
    }
    
    //@Override告诉编译器下面这个方法不是新写的，而是要覆盖掉父类（Object）的旧方法。
    //public 修饰符，任何地方都能调用这个方法。
    //String 返回值类型，说明这个方法要返回一个字符串。
    //toString() 方法名，Java规定toString是Object类里的一个方法，我们在这里重写它。
    // pubilc String toString()，定义一个返回字符串的方法。
    //return，把某个值作为方法的结果交出去。getDate()会返回date这个成员变量的值（一个String）
    //return getDate();方法结果就是对象的日期属性。
    @Override
    public String toString(){
        return getDate();
    }
}
