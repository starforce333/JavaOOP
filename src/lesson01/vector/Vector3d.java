package lesson01.vector;

public class Vector3d {
    private double x;
    private double y;
    private double z;
    private double[] addition;
    private double[] scalar;
    private double[] vector;


    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector3d() {
    }

    public void addition(double ax, double bx, double ay, double by, double az, double bz) {
        addition = new double[]{ax + bx, ay + by, az + bz};
    }

    public void scalar(double ax, double bx, double ay, double by, double az, double bz) {
        scalar = new double[]{ax * bx, ay * by, az * bz};
    }

    public void vector(double ax, double bx, double ay, double by, double az, double bz) {
        vector = new double[]{ay*bz - az*by, az*bx - ax*bz, ax*by - ay*bx};
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setZ(double z) {
        this.z = z;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public double[] getAddition() {
        return addition;
    }
    public double[] getScalar() {
        return scalar;
    }
    public double[] getVector() {
        return vector;
    }
}


//        3)  Описать  класс  «Vector3d»  (т. е.,  он  должен  описывать  вектор  в  трехмерной,
//        декартовой  системе  координат).  В  качестве  свойств  этого  класса  возьмите
//        координаты вектора. Для этого класса реализовать методы сложения,  скалярного и
//        векторного  произведения  векторов.  Создайте  несколько  объектов  этого  класса  и
//        протестируйте их.
//        4) Опишите класс Phone (одним из свойств должен быть его номер). Также опишите
//        класс  Network  (сеть  мобильного  оператора).  Телефон  должен  иметь  метод
//        регистрации в сети мобильного оператора. Также у телефона должен быть метод call
//        (номер другого телефона), который переберет все телефоны, зарегистрированные в
//        сети.  Если  такой  номер  будет  найден,  то  осуществить  вызов,  если  нет  -  вывести
//        сообщение об ошибочности набранного номера.